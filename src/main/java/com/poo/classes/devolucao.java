package com.poo.classes;

import java.util.Date;

public class devolucao {

    private int devolucaoId;
    private Date dataDevolvido;

    public devolucao(int devolucaoId, Date dataDevolvido) {
        this.devolucaoId = devolucaoId;
        this.dataDevolvido = dataDevolvido;
    }

    public int getDevolucaoId() {
        return devolucaoId;
    }

    public void setDevolucaoId(int devolucaoId) {
        this.devolucaoId = devolucaoId;
    }

    public Date getDataDevolvido() {
        return dataDevolvido;
    }

    public void setDataDevolvido(Date dataDevolvido) {
        this.dataDevolvido = dataDevolvido;
    }
}
