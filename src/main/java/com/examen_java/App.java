package com.examen_java;

import java.util.Scanner;
import repositories.CoursRepository;
import repositories.NiveauRepository;
import repositories.ClasseRepository;
import services.CoursService;
import services.NiveauService;
import services.ClasseService;

public class App {
    private static Scanner scanner = new Scanner(System.in);

    private static CoursRepository coursRepository = new CoursRepository();
    private static NiveauRepository niveauRepository = new NiveauRepository();
    private static ClasseRepository classeRepository = new ClasseRepository();

    private static CoursService coursService = new CoursService(coursRepository);
    private static NiveauService niveauService = new NiveauService(niveauRepository);
    private static ClasseService classeService = new ClasseService(classeRepository, niveauRepository);

    public static void main(String[] args) {
        int choix;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Créer un cours");
            System.out.println("2. Créer un niveau");
            System.out.println("3. Créer une classe");
            System.out.println("4. Lister les cours");
            System.out.println("5. Lister les niveaux");
            System.out.println("6. Lister les classes");
            System.out.println("7. Quitter");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();
            scanner.nextLine(); 

            switch (choix) {
                case 1:
                    createCours();
                    break;
                case 2:
                    createNiveau();
                    break;
                case 3:
                    createClasse();
                    break;
                case 4:
                    listCours();
                    break;
                case 5:
                    listNiveaux();
                    break;
                case 6:
                    listClasses();
                    break;
                case 7:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
                    break;
            }
        } while (choix != 7);
    }

    
    private static void createCours() {
        System.out.print("Nom du cours : ");
        String nomCours = scanner.nextLine();

        System.out.print("Nom du professeur : ");
        String nomProfesseur = scanner.nextLine();

        System.out.print("Module du cours : ");
        String module = scanner.nextLine();

        coursService.createCours(nomCours, nomProfesseur, module);
    }

    
    private static void createNiveau() {
        System.out.print("Nom du niveau : ");
        String nomNiveau = scanner.nextLine();

        niveauService.createNiveau(nomNiveau);
    }

    
    private static void createClasse() {
        System.out.print("Nom de la classe : ");
        String nomClasse = scanner.nextLine();

        System.out.print("ID du niveau auquel appartient la classe : ");
        int niveauId = scanner.nextInt();
        scanner.nextLine(); 

        classeService.createClasse(nomClasse, niveauId);
    }

    
    private static void listCours() {
        coursService.listCours();
    }

    
    private static void listNiveaux() {
        niveauService.listNiveaux();
    }

    
    private static void listClasses() {
        classeService.listClasses();
    }
}
