package services;

import entity.Cours;
import repositories.CoursRepository;

public class CoursService {
    private CoursRepository coursRepository;

    public CoursService(CoursRepository coursRepository) {
        this.coursRepository = coursRepository;
    }

    public void createCours(String nom, String professeur, String module) {
        Cours cours = new Cours(nom, professeur, module);
        coursRepository.addCours(cours);
        System.out.println("Cours créé avec succès !");
    }

    
    public void listCours() {
        coursRepository.getAllCours().forEach(cours -> {
            System.out.println("ID: " + cours.getId() + ", Nom: " + cours.getNom() +
                               ", Professeur: " + cours.getProfesseur() +
                               ", Module: " + cours.getModule());
        });
    }
}
