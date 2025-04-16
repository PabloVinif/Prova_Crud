package com.example.demo.Trabalho.Model;

import com.example.demo.Pessoa.Model.Pessoa;
import jakarta.persistence.*;

@Entity
public class Trabalho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String endereco;

    public Trabalho() {}

    public Trabalho(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "Pessoa_id")
    private Pessoa pessoa;

}




