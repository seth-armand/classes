package com.poo.classes;

public class pessoa {

    private int pessoaId;
    private String rg;
    private String cpf;
    private String nome;
    private endereco endereco;

    
    public int getPessoaId() {
        return pessoaId;
    }
    public void setPessoaId(int pessoaId) {
        this.pessoaId = pessoaId;
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
    public endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(endereco endereco) {
        this.endereco = endereco;
    }

}
