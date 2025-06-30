package com.navoo.backend.controller;

import com.navoo.backend.model.Influenciador;
import com.navoo.backend.repository.InfluenciadorRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/influenciadores")
public class InfluenciadorController {
    private final InfluenciadorRepository influenciadorRepository;

    public InfluenciadorController(InfluenciadorRepository influenciadorRepository) {
        this.influenciadorRepository = influenciadorRepository;
    }

    @GetMapping
    public List<Influenciador> listarInfluenciadores() {
        return influenciadorRepository.findAll();
    }
} 