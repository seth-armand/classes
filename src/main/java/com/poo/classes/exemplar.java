package com.poo.classes;

public class exemplar {

    private int exemplarId;
    private livro livro;

    public exemplar(int exemplarId, livro livro) {
        this.exemplarId = exemplarId;
        this.livro = livro;
    }

    public int getExemplarId() {
        return exemplarId;
    }

    public void setExemplarId(int exemplarId) {
        this.exemplarId = exemplarId;
    }

    public livro getLivro() {
        return livro;
    }

    public void setLivro(livro livro) {
        this.livro = livro;
    }

}
