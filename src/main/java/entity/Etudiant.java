package entity;

public class Etudiant {
    private String nom;
    private Classe classe;

    public Etudiant(String nom, Classe classe) {
        this.nom = nom;
        this.classe = classe;
    }

    public String getNom() {
        return nom;
    }

    public Classe getClasse() {
        return classe;
    }
}

