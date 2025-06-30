package com.navoo.backend.controller;

import com.navoo.backend.model.Empresa;
import com.navoo.backend.model.Influenciador;
import com.navoo.backend.model.TipoUsuario;
import com.navoo.backend.model.Usuario;
import com.navoo.backend.repository.EmpresaRepository;
import com.navoo.backend.repository.InfluenciadorRepository;
import com.navoo.backend.repository.UsuarioRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final EmpresaRepository empresaRepository;
    private final InfluenciadorRepository influenciadorRepository;
    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    public AuthController(EmpresaRepository empresaRepository, InfluenciadorRepository influenciadorRepository, UsuarioRepository usuarioRepository, PasswordEncoder passwordEncoder) {
        this.empresaRepository = empresaRepository;
        this.influenciadorRepository = influenciadorRepository;
        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping("/cadastro/empresa")
    public ResponseEntity<?> cadastrarEmpresa(@RequestBody Empresa empresa) {
        if (usuarioRepository.findByEmail(empresa.getEmail()) != null) {
            return ResponseEntity.badRequest().body("E-mail já cadastrado");
        }
        empresa.setTipo(TipoUsuario.EMPRESA);
        empresa.setSenha(passwordEncoder.encode(empresa.getSenha()));
        return ResponseEntity.ok(empresaRepository.save(empresa));
    }

    @PostMapping("/cadastro/influenciador")
    public ResponseEntity<?> cadastrarInfluenciador(@RequestBody Influenciador influenciador) {
        if (usuarioRepository.findByEmail(influenciador.getEmail()) != null) {
            return ResponseEntity.badRequest().body("E-mail já cadastrado");
        }
        influenciador.setTipo(TipoUsuario.INFLUENCIADOR);
        influenciador.setSenha(passwordEncoder.encode(influenciador.getSenha()));
        return ResponseEntity.ok(influenciadorRepository.save(influenciador));
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> login) {
        String email = login.get("email");
        String senha = login.get("senha");
        Usuario usuario = usuarioRepository.findByEmail(email);
        if (usuario == null || !passwordEncoder.matches(senha, usuario.getSenha())) {
            return ResponseEntity.status(401).body("Usuário ou senha inválidos");
        }
        return ResponseEntity.ok("Login realizado com sucesso!");
    }
} 