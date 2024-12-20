package services;

import entity.Classe;
import entity.Niveau;
import repositories.ClasseRepository;
import repositories.NiveauRepository;

public class ClasseService {
    private ClasseRepository classeRepository;
    private NiveauRepository niveauRepository;

    public ClasseService(ClasseRepository classeRepository, NiveauRepository niveauRepository) {
        this.classeRepository = classeRepository;
        this.niveauRepository = niveauRepository;
    }

    
    public void createClasse(String nomClasse, int niveauId) {
        Niveau niveau = niveauRepository.getNiveauById(niveauId);
        if (niveau != null) {
            Classe classe = new Classe(nomClasse, niveau);
            classeRepository.addClasse(classe);
            System.out.println("Classe créée avec succès !");
        } else {
            System.out.println("Erreur : Aucun niveau trouvé avec cet ID.");
        }
    }

    
    public void listClasses() {
        classeRepository.getAllClasses().forEach(classe -> {
            System.out.println("ID: " + classe.getId() + ", Nom: " + classe.getNom() +
                               ", Niveau: " + classe.getNiveau().getNom());
        });
    }
}
