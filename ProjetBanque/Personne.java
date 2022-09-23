package com.ProjetBanque;

public abstract class Personne {
    private String nom;
    private String prenom;
    private String adresse;
    private String dateNaissance;
    private String id;
    private String login;
    private String motDePasse;
    private long telephone;
    private String email;

    public Personne (String nom, String prenom, String adresse, String dateNaissance, String id, String login, String motDePasse, long telephone, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.dateNaissance = dateNaissance;
        this.id = id;
        this.login = login;
        this.motDePasse = motDePasse;
        this.telephone = telephone;
        this.email = email;
    }

    public  String getNom() {
        return nom;
    }

    public  void setNom(String nom) {
        this.nom = nom;
    }

    public  String getPrenom() {
        return prenom;
    }

    public  void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public  String getAdresse() {
        return adresse;
    }

    public  void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public  void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public  String getId() {
        return id;
    }

    public  void setId(String id) {
        this.id = id;
    }

    public  String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public  long getTelephone() {
        return telephone;
    }

    public  void setTelephone(long telephone) {
        this.telephone = telephone;
    }

    public  String getEmail() {
        return email;
    }

    public  void setEmail(String email) {
        this.email = email;
    }
}
