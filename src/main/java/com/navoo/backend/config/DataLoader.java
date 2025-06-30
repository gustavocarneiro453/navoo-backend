package com.navoo.backend.config;

import com.navoo.backend.model.Empresa;
import com.navoo.backend.model.Influenciador;
import com.navoo.backend.model.TipoUsuario;
import com.navoo.backend.repository.EmpresaRepository;
import com.navoo.backend.repository.InfluenciadorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final EmpresaRepository empresaRepository;
    private final InfluenciadorRepository influenciadorRepository;
    private final PasswordEncoder passwordEncoder;

    public DataLoader(EmpresaRepository empresaRepository, InfluenciadorRepository influenciadorRepository, PasswordEncoder passwordEncoder) {
        this.empresaRepository = empresaRepository;
        this.influenciadorRepository = influenciadorRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) {
        if (empresaRepository.count() == 0) {
            Empresa e1 = new Empresa();
            e1.setNomeEmpresa("IGP GRAFICA");
            e1.setSegmento("GRAFICA");
            e1.setSeguidores(3484);
            e1.setLocalizacao("RECIFE");
            e1.setContato("(81) 99788-3935");
            e1.setPerfil("@GRAFICAIGP");
            e1.setStatus("TOPOU");
            e1.setObservacao("");
            e1.setTipo(TipoUsuario.EMPRESA);
            e1.setNome("IGP GRAFICA");
            e1.setEmail("");
            e1.setSenha(passwordEncoder.encode("123456"));
            empresaRepository.save(e1);
        }
        if (influenciadorRepository.count() == 0) {
            Influenciador i1 = new Influenciador();
            i1.setNome("HUGO LIMA");
            i1.setSegmento("HUMOR");
            i1.setSeguidores(102000);
            i1.setPerfil("@HUGOCONTADORDEHISTORIA");
            i1.setStatus("TOPOU");
            i1.setTipo(TipoUsuario.INFLUENCIADOR);
            i1.setSenha(passwordEncoder.encode("123456"));
            influenciadorRepository.save(i1);

            Influenciador i2 = new Influenciador();
            i2.setNome("MATHEUS, MARCO E MONY");
            i2.setSegmento("COMIDA");
            i2.setSeguidores(293000);
            i2.setLocalizacao("SP");
            i2.setPerfil("@EMBARCARNACOMIDA");
            i2.setStatus("TOPOU");
            i2.setTipo(TipoUsuario.INFLUENCIADOR);
            i2.setSenha(passwordEncoder.encode("123456"));
            influenciadorRepository.save(i2);

            Influenciador i3 = new Influenciador();
            i3.setNome("LETTICIA PAES");
            i3.setSegmento("LIFESTYLE");
            i3.setSeguidores(49200);
            i3.setLocalizacao("RECIFE");
            i3.setPerfil("@LETTICIAPAESBARRETO");
            i3.setStatus("TOPOU");
            i3.setTipo(TipoUsuario.INFLUENCIADOR);
            i3.setSenha(passwordEncoder.encode("123456"));
            influenciadorRepository.save(i3);

            Influenciador i4 = new Influenciador();
            i4.setNome("RENATO BARROS");
            i4.setSegmento("JORNALISMO");
            i4.setSeguidores(23200);
            i4.setLocalizacao("RECIFE");
            i4.setPerfil("@RENATORBARROS");
            i4.setStatus("TOPOU");
            i4.setTipo(TipoUsuario.INFLUENCIADOR);
            i4.setSenha(passwordEncoder.encode("123456"));
            influenciadorRepository.save(i4);

            Influenciador i5 = new Influenciador();
            i5.setNome("TIMBUCAST");
            i5.setSegmento("FUTEBOL");
            i5.setSeguidores(12100);
            i5.setLocalizacao("RECIFE");
            i5.setPerfil("@TIMBUCAST");
            i5.setStatus("TOPOU");
            i5.setTipo(TipoUsuario.INFLUENCIADOR);
            i5.setSenha(passwordEncoder.encode("123456"));
            influenciadorRepository.save(i5);

            Influenciador i6 = new Influenciador();
            i6.setNome("LEO MEDRADO");
            i6.setSegmento("FUTEBOL");
            i6.setSeguidores(50000);
            i6.setLocalizacao("RECIFE");
            i6.setPerfil("@LEOMEDRADOPE");
            i6.setStatus("TOPOU");
            i6.setTipo(TipoUsuario.INFLUENCIADOR);
            i6.setSenha(passwordEncoder.encode("123456"));
            influenciadorRepository.save(i6);

            Influenciador i7 = new Influenciador();
            i7.setNome("EXPLORANDO FATOS");
            i7.setSegmento("CURIOSIDADES");
            i7.setSeguidores(119000);
            i7.setPerfil("@EXPLORANDO.FATOS");
            i7.setStatus("TOPOU");
            i7.setTipo(TipoUsuario.INFLUENCIADOR);
            i7.setSenha(passwordEncoder.encode("123456"));
            influenciadorRepository.save(i7);

            Influenciador i8 = new Influenciador();
            i8.setNome("CARLA E PAULO");
            i8.setSegmento("COMIDA");
            i8.setSeguidores(218000);
            i8.setLocalizacao("RECIFE");
            i8.setPerfil("@PRECISOCOMERISSO");
            i8.setStatus("TOPOU");
            i8.setTipo(TipoUsuario.INFLUENCIADOR);
            i8.setSenha(passwordEncoder.encode("123456"));
            influenciadorRepository.save(i8);

            Influenciador i9 = new Influenciador();
            i9.setNome("LUAN RODRIGUES");
            i9.setSegmento("FUTEBOL");
            i9.setSeguidores(215000);
            i9.setEmail("luanx.xofc@gmail.com");
            i9.setPerfil("@_LUANX.X");
            i9.setStatus("TOPOU");
            i9.setTipo(TipoUsuario.INFLUENCIADOR);
            i9.setSenha(passwordEncoder.encode("123456"));
            influenciadorRepository.save(i9);
        }
    }
} 