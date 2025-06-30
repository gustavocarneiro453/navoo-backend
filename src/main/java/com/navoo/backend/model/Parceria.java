package com.navoo.backend.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Parceria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Empresa empresa;

    @ManyToOne
    private Influenciador influenciador;

    @Enumerated(EnumType.STRING)
    private StatusParceria status;

    private String resultado; // Ex: vendas geradas, views, etc.

    private LocalDateTime dataCriacao;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Empresa getEmpresa() { return empresa; }
    public void setEmpresa(Empresa empresa) { this.empresa = empresa; }
    public Influenciador getInfluenciador() { return influenciador; }
    public void setInfluenciador(Influenciador influenciador) { this.influenciador = influenciador; }
    public StatusParceria getStatus() { return status; }
    public void setStatus(StatusParceria status) { this.status = status; }
    public String getResultado() { return resultado; }
    public void setResultado(String resultado) { this.resultado = resultado; }
    public LocalDateTime getDataCriacao() { return dataCriacao; }
    public void setDataCriacao(LocalDateTime dataCriacao) { this.dataCriacao = dataCriacao; }
} 