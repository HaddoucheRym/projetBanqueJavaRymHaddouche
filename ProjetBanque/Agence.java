package com.ProjetBanque;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Agence  {
    List<Personne> listePersonnes = new ArrayList<>();
    List<CompteBancaire> listeComptes = new ArrayList<>();

    public void ajouterPersonne (Personne p) {
        listePersonnes.add(p);
    }

    public void ajouterCompte (CompteBancaire c) {
        listeComptes.add(c);
    }



}
