package com.example.crm.Contato;


import com.example.crm.pessoas.Pessoas;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Contato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo;
    private String valor;

    @ManyToOne
    @JoinColumn(name = "pessoa_id")
    private Pessoas pessoa;

    public Contato() {
    }

    public Contato(String tipo, String valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Pessoas getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoas pessoa) {
        this.pessoa = pessoa;
    }
}
