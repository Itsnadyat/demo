package entity;

public class Classe {
    private int id;
    private String nom;
    private Niveau niveau;

    public Classe(String nom, Niveau niveau) {
        this.nom = nom;
        this.niveau = niveau;
    }

    // Getters et Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public Niveau getNiveau() { return niveau; }
    public void setNiveau(Niveau niveau) { this.niveau = niveau; }
}
