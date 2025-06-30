package com.navoo.backend.model;

import jakarta.persistence.Entity;

@Entity
public class Empresa extends Usuario {
    private String nomeEmpresa;
    private String cnpj;
    private String segmento;
    private Integer seguidores;
    private String localizacao;
    private String email;
    private String contato;
    private String perfil;
    private String status;
    private String observacao;

    // Getters e Setters
    public String getNomeEmpresa() { return nomeEmpresa; }
    public void setNomeEmpresa(String nomeEmpresa) { this.nomeEmpresa = nomeEmpresa; }
    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }
    public String getSegmento() { return segmento; }
    public void setSegmento(String segmento) { this.segmento = segmento; }
    public Integer getSeguidores() { return seguidores; }
    public void setSeguidores(Integer seguidores) { this.seguidores = seguidores; }
    public String getLocalizacao() { return localizacao; }
    public void setLocalizacao(String localizacao) { this.localizacao = localizacao; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getContato() { return contato; }
    public void setContato(String contato) { this.contato = contato; }
    public String getPerfil() { return perfil; }
    public void setPerfil(String perfil) { this.perfil = perfil; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getObservacao() { return observacao; }
    public void setObservacao(String observacao) { this.observacao = observacao; }
} 