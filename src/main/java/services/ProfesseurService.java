package services;

import entity.Cours;
import entity.Professeur;

public class ProfesseurService {

    public void ajouterCoursAuProfesseur(Professeur professeur, Cours cours) {
        professeur.ajouterCours(cours);
        System.out.println("Cours " + cours.getNom() + " ajouté au professeur " + professeur.getNom());
    }

    public void afficherCoursParProfesseur(Professeur professeur) {
        System.out.println("Cours enseignés par le professeur " + professeur.getNom() + ":");
        for (Cours cours : professeur.getCours()) {
            System.out.println(cours.getNom());
        }
    }
}
