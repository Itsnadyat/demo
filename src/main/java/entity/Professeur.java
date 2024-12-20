package entity;

import java.util.ArrayList;
import java.util.List;

public class Professeur {
    private String nom;
    private List<Cours> cours;

    public Professeur(String nom) {
        this.nom = nom;
        this.cours = new ArrayList<>();
    }

    public void ajouterCours(Cours cours) {
        this.cours.add(cours);
    }

    public String getNom() {
        return nom;
    }

    public List<Cours> getCours() {
        return cours;
    }
}
