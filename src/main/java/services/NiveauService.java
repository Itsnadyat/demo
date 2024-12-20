package services;

import entity.Niveau;
import repositories.NiveauRepository;

public class NiveauService {
    private NiveauRepository niveauRepository;

    public NiveauService(NiveauRepository niveauRepository) {
        this.niveauRepository = niveauRepository;
    }

    
    public void createNiveau(String nom) {
        Niveau niveau = new Niveau(nom);
        niveauRepository.addNiveau(niveau);
        System.out.println("Niveau créé avec succès !");
    }

    
    public void listNiveaux() {
        niveauRepository.getAllNiveaux().forEach(niveau -> {
            System.out.println("ID: " + niveau.getId() + ", Nom: " + niveau.getNom());
        });
    }
}
