package com.ProjetBanque;

public class CompteBancaire {
    private double solde;
    private String dateOuverture;
    private long numero;

    public CompteBancaire(double solde, String dateOuverture, long numero) {
        this.solde = solde;
        this.dateOuverture = dateOuverture;
        this.numero = numero;
    }

    public double getSolde () {
        return solde;
    }

    public void setSolde ( double solde) {
        this.solde = solde;
    }

    public String getDateOuverture () {
        return dateOuverture;
    }

    public void setDateOuverture (String dateOuverture) {
        this.dateOuverture = dateOuverture;
    }

    public long getNumero () {
        return numero;
    }

    public void setNumero ( long numero) {
        this.numero = numero;
    }
}
