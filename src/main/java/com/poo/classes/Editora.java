package com.poo.classes;

public class Editora {
    
    private int editoraId;
    private String nome;

    public Editora(int editoraId, String nome) {
        this.editoraId = editoraId;
        this.nome = nome;
    }

    public int getEditoraId() {
        return editoraId;
    }

    public void setEditoraId(int editoraId) {
        this.editoraId = editoraId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
