package com.poo.classes;

import java.util.Date;
import java.util.List;

public class emprestimo {
    private int emprestimoId;
    private Date dataEmprestimo;
    private Date dataPrevDev;
    private pessoa pessoa;
    private List<ExemplarEmprestimo> exemplaresEmprestimo;

    public emprestimo(int emprestimoId, Date dataEmprestimo, Date dataPrevDev, pessoa pessoa, List<ExemplarEmprestimo> exemplaresEmprestimo) {
        this.emprestimoId = emprestimoId;
        this.dataEmprestimo = dataEmprestimo;
        this.dataPrevDev = dataPrevDev;
        this.pessoa = pessoa;
        this.exemplaresEmprestimo = exemplaresEmprestimo;
    }

    public int getEmprestimoId() {
        return emprestimoId;
    }

    public void setEmprestimoId(int emprestimoId) {
        this.emprestimoId = emprestimoId;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataPrevDev() {
        return dataPrevDev;
    }

    public void setDataPrevDev(Date dataPrevDev) {
        this.dataPrevDev = dataPrevDev;
    }

    public pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<ExemplarEmprestimo> getExemplaresEmprestimo() {
        return exemplaresEmprestimo;
    }

    public void setExemplaresEmprestimo(List<ExemplarEmprestimo> exemplaresEmprestimo) {
        this.exemplaresEmprestimo = exemplaresEmprestimo;
    }

}
