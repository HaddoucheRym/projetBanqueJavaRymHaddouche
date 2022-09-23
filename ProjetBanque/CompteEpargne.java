package com.ProjetBanque;

public class CompteEpargne extends CompteBancaire{
    private double tauxEpargne;

    public CompteEpargne(double solde, String dateOuverture, long numero, double tauxEpargne) {
        super(solde, dateOuverture, numero);
        this.tauxEpargne = tauxEpargne;
    }

    public double getTauxEpargne() {
        return tauxEpargne;
    }

    public void setTauxEpargne(double tauxEpargne) {
        this.tauxEpargne = tauxEpargne;
    }
}
