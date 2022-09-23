package com.ProjetBanque;

public class CompteCourant extends CompteBancaire{
    private double autorisationDecouverte;
    private String[] historiqueOperationsEffectuées;

    public CompteCourant(double solde, String dateOuverture, long numero, double autorisationDecouverte, String[] historiqueOperationsEffectuées) {
        super(solde, dateOuverture, numero);
        this.autorisationDecouverte = autorisationDecouverte;
        this.historiqueOperationsEffectuées = historiqueOperationsEffectuées;
    }

    public double getAutorisationDecouverte() {
        return autorisationDecouverte;
    }

    public void setAutorisationDecouverte(double autorisationDecouverte) {
        this.autorisationDecouverte = autorisationDecouverte;
    }

    public String[] getHistoriqueOperationsEffectuées() {
        return historiqueOperationsEffectuées;
    }

    public void setHistoriqueOperationsEffectuées(String[] historiqueOperationsEffectuées) {
        this.historiqueOperationsEffectuées = historiqueOperationsEffectuées;
    }
}
