package com.poo.classes;

public class endereco {

    private int enderecoId;
    private String uf;
    private String cidade;
    private String tipo;
    private String logradouro;
    private String complemento;

    
    public int getEnderecoId() {
        return enderecoId;
    }
    public void setEnderecoId(int enderecoId) {
        this.enderecoId = enderecoId;
    }
    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

}
