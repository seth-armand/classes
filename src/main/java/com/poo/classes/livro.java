package com.poo.classes;

public class livro { 
    private int livroId;
    private String edicao;
    private String titulo;
    private int ano;
    private Autor autor;
    private Editora editora;

    public livro(int livroId, String edicao, String titulo, int ano, Autor autor, Editora editora) {
        
        this.livroId = livroId;
        this.edicao = edicao;
        this.titulo = titulo;
        this.ano = ano;
        this.autor = autor;
        this.editora = editora;
    }

    public int getLivroId() {
        return livroId;
    }

    public void setLivroId(int livroId) {
        this.livroId = livroId;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

}
