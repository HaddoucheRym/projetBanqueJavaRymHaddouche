package com.ProjetBanque;



import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
static List<Client> listeClients = new ArrayList<>();
public static void ajouterClient(Client ajoutClient) {
   listeClients.add(ajoutClient);
}

public static void afficherClient(){
    for (Client affiche: listeClients) {
        System.out.println(affiche);
    }
}

    public static void main(String[] args) {
        List<Client> listeClients = new ArrayList<>();
        Banque banque = new Banque("125df", "12/5/2021", 145269, "france", "15 rue france");
        Client client = new Client("Duboit", "Jean", "16 rue paris", "12/8/1984", "12547df", "bilbo", "sdghsdt158*/", 0125, "jeanduboit@gmail.com");
        CompteBancaire compteBancaire = new CompteBancaire(12445.25, "128/1999", 1254);
        CompteCourant compteCourant = new CompteCourant(1125.25, "128/1999", 1254, 358.25, new String[]{"Tom", "Mike"});
        CompteEpargne compteEpargne = new CompteEpargne(125.47, "128/1999", 1254, 398.558);
        CompteRemunere compteRemunere = new CompteRemunere(1235.50, "128/1999", 1254, 125.558);




      boolean stop = true;

        while (stop == true) {
            System.out.println("choisir un numero");
            System.out.println("1- retrait d'argent");
            System.out.println("2- virement");
            System.out.println("3- afficher solde");
            System.out.println("4- versement");
            System.out.println("5- deconnexion");
            Scanner sc = new Scanner(System.in);
            System.out.println("Veuillez saisir un numero :");

            int numero = sc.nextInt();
            if (numero == 1) {
                client.retrait();
            } else if (numero == 2) {
                client.virement();
            } else if (numero == 3) {
                System.out.println("choisir un compte pour afficher le solde");
                System.out.println("1- compte courant");
                System.out.println("2- compte epargne");
                System.out.println("3- compte remuniré");
                int nbr = sc.nextInt();
                if (nbr == 1) {
                    client.ajouterCompte(compteCourant);
                }else if (nbr == 2) {
                    client.ajouterCompte(compteEpargne);
                }else if (nbr == 3){
                    client.ajouterCompte(compteRemunere);
                }
                client.affichageSolde();
            } else if (numero == 4) {
                System.out.println("choisir un compte");
                System.out.println("1- compte courant");
                System.out.println("2- compte epargne");
                System.out.println("3- compte remuniré");
                int nbr = sc.nextInt();
                if (nbr == 1) {
                    client.ajouterCompte(compteCourant);
                }else if (nbr == 2) {
                    client.ajouterCompte(compteEpargne);
                }else if (nbr == 3){
                    client.ajouterCompte(compteRemunere);
                }
                client.versement();
            }else if (numero == 5){
                stop = false;
                System.out.println("Vous etes deconéctés");
            }
        }
    }
}
