package com.cadastro.BancoDeDadosCadastro.models;

import com.cadastro.BancoDeDadosCadastro.dtos.CadastroDTO;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "cliente")
public class CadastroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String nome;
    private String cpf;
    private String rg;
    private String celular;
    private String endereco;

    public CadastroModel() {
    }

    public CadastroModel(CadastroDTO dto){
        this.nome = dto.nome();
        this.cpf = dto.cpf();
        this.rg = dto.rg();
        this.celular = dto.celular();
        this.endereco = dto.endereco();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
