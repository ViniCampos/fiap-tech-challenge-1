package br.com.fiap.tech_challenge_1.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name="tb_pagador")
public class Pagador {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nome;
    private String CPF;
    private String CEP;
    private String Endereco;
    private String Complemento;

    public Pagador() {
    }

    @Override
    public String toString() {
        return "Pagador{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", CEP='" + CEP + '\'' +
                ", Endereco='" + Endereco + '\'' +
                ", Complemento='" + Complemento + '\'' +
                '}';
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String complemento) {
        Complemento = complemento;
    }
}
