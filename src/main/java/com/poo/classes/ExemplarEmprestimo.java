package com.poo.classes;

public class ExemplarEmprestimo {

    private int exemplarEmprestimoId;
    private exemplar exemplar;
    private emprestimo emprestimo;
    private devolucao devolucao;
    
    public int getExemplarEmprestimoId() {
        return exemplarEmprestimoId;
    }
    public void setExemplarEmprestimoId(int exemplarEmprestimoId) {
        this.exemplarEmprestimoId = exemplarEmprestimoId;
    }
    public exemplar getExemplar() {
        return exemplar;
    }
    public void setExemplar(exemplar exemplar) {
        this.exemplar = exemplar;
    }
    public emprestimo getEmprestimo() {
        return emprestimo;
    }
    public void setEmprestimo(emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }
    public devolucao getDevolucao() {
        return devolucao;
    }
    public void setDevolucao(devolucao devolucao) {
        this.devolucao = devolucao;
    }

}
