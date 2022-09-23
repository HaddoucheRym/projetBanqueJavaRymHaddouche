package com.ProjetBanque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Client extends Personne {
    List<CompteBancaire> listeComptes = new ArrayList<>();


    public Client(String nom, String prenom, String adresse, String dateNaissance, String id, String login, String motDePasse, long telephone, String email) {
        super(nom, prenom, adresse, dateNaissance, id, login, motDePasse, telephone, email);
    }

    public void ajouterCompte(CompteBancaire c) {
        listeComptes.add(c);
    }


    public void retrait() {
        Scanner sc = new Scanner(System.in);
        for (CompteBancaire com : listeComptes) {
            if (com instanceof CompteCourant) {
                CompteCourant compteCourant = (CompteCourant) com;
                if (compteCourant.getSolde() > 0) {
                    System.out.println("autorisation retrait");
                    System.out.println("Veuillez saisir un montant :");
                    double montantRetrait = sc.nextDouble();
                    if (montantRetrait <= compteCourant.getAutorisationDecouverte()) {
                        System.out.println("Retrait effectué");
                        double nouveauSolde1 = compteCourant.getSolde() - montantRetrait;
                        compteCourant.setSolde(nouveauSolde1);
                        System.out.println("le nouveau solde est " + compteCourant.getSolde() + "€");
                    } else if (montantRetrait > compteCourant.getAutorisationDecouverte()){
                        System.out.println("le retrait n'est pas autorisé");
                    }
                }
            }
        }
    }

    public void virement() {
        Scanner sc = new Scanner(System.in);
        for (CompteBancaire c : listeComptes) {
            if (c instanceof CompteCourant) {
                CompteCourant compteCourant = (CompteCourant) c;
                if (compteCourant.getSolde() > 0) {
                    System.out.println("autorisation virement");
                    System.out.println("Veuillez saisir un montant :");
                    double montant = sc.nextDouble();
                    if (montant <= compteCourant.getAutorisationDecouverte()) {
                        System.out.println("virement effectué");
                        double nouveauSolde = compteCourant.getSolde() - montant;
                        compteCourant.setSolde(nouveauSolde);
                        System.out.println("le nouveau solde est " + compteCourant.getSolde() + "€");
                    }
                } else {
                    System.out.println("le virement n'est pas autorisé");
                }
            }
        }
    }

    public void affichageSolde() {
        for (CompteBancaire c : listeComptes) {
            if (c instanceof CompteCourant) {
                CompteCourant compteCourant = (CompteCourant) c;
                System.out.println("votre solde compte courant  est : " + compteCourant.getSolde());
            }else if (c instanceof CompteEpargne) {
                CompteEpargne compteEpargne = (CompteEpargne) c;
                System.out.println("votre solde compte epargne  est : " + compteEpargne.getSolde());
            }else if (c instanceof CompteRemunere) {
                CompteRemunere compteRemunere = (CompteRemunere) c;
                System.out.println("votre solde compte remuneré  est : " + compteRemunere.getSolde());
            }
        }
    }

    public void versement() {
        Scanner sc = new Scanner(System.in);
        double nouveauSolde = 0 ;
        for (CompteBancaire c : listeComptes) {
            if (c instanceof CompteCourant) {
                CompteCourant compteCourant = (CompteCourant) c;
                System.out.println("Veuillez saisir un montant :");
                double montant = sc.nextDouble();
                 nouveauSolde = compteCourant.getSolde() + montant;
                compteCourant.setSolde(nouveauSolde);
                System.out.println("le nouveau solde de compteCourant est " + compteCourant.getSolde() + "€");
            }else if(c instanceof CompteEpargne) {
                CompteEpargne compteEpargne = (CompteEpargne) c;
                System.out.println("Veuillez saisir un montant :");
                double montant = sc.nextDouble();
                 nouveauSolde = compteEpargne.getSolde() + montant;
                compteEpargne.setSolde(nouveauSolde);
                System.out.println("le nouveau solde dans le compteEpargne est " + compteEpargne.getSolde() + "€");
            }else if(c instanceof CompteRemunere) {
                CompteRemunere compteRemunere = (CompteRemunere) c;
                System.out.println("Veuillez saisir un montant :");
                double montant = sc.nextDouble();
                 nouveauSolde = compteRemunere.getSolde() + montant;
                compteRemunere.setSolde(nouveauSolde);
                System.out.println("le nouveau solde dans le compteRemuniré est " + compteRemunere.getSolde() + "€");
            }
        }
    }
}
