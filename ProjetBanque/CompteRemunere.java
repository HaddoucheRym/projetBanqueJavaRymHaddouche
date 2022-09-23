package com.ProjetBanque;

public class CompteRemunere extends CompteBancaire{
    private double tauxRemuneration;

    public CompteRemunere(double solde, String dateOuverture, long numero, double tauxRemuneration) {
        super(solde, dateOuverture, numero);
        this.tauxRemuneration = tauxRemuneration;
    }

    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }
}
