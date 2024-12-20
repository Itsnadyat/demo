package entity;

public class Cours {
    private int id;
    private String nom;
    private String professeur;
    private String module;

    public Cours(String nom, String professeur, String module) {
        this.nom = nom;
        this.professeur = professeur;
        this.module = module;
    }

    // Getters et Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getProfesseur() { return professeur; }
    public void setProfesseur(String professeur) { this.professeur = professeur; }

    public String getModule() { return module; }
    public void setModule(String module) { this.module = module; }
}

