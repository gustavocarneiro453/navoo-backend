package com.navoo.backend.model;

import jakarta.persistence.Entity;

@Entity
public class Influenciador extends Usuario {
    private Integer seguidores;
    private String cidade;
    private String nicho;
    private Double taxaConversao;
    private String segmento;
    private String localizacao;
    private String email;
    private String telefone;
    private String perfil;
    private String status;
    private String observacao;

    // Getters e Setters
    public Integer getSeguidores() { return seguidores; }
    public void setSeguidores(Integer seguidores) { this.seguidores = seguidores; }
    public String getCidade() { return cidade; }
    public void setCidade(String cidade) { this.cidade = cidade; }
    public String getNicho() { return nicho; }
    public void setNicho(String nicho) { this.nicho = nicho; }
    public Double getTaxaConversao() { return taxaConversao; }
    public void setTaxaConversao(Double taxaConversao) { this.taxaConversao = taxaConversao; }
    public String getSegmento() { return segmento; }
    public void setSegmento(String segmento) { this.segmento = segmento; }
    public String getLocalizacao() { return localizacao; }
    public void setLocalizacao(String localizacao) { this.localizacao = localizacao; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public String getPerfil() { return perfil; }
    public void setPerfil(String perfil) { this.perfil = perfil; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getObservacao() { return observacao; }
    public void setObservacao(String observacao) { this.observacao = observacao; }
} 