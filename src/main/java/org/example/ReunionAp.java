
package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ReunionAp {
    private static Set<Person> participant = new HashSet<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int Choix;
        do {
            System.out.println("\n-- MENU --");
            System.out.println("1. Ajouter");
            System.out.println("2. Supprimer");
            System.out.println("3. Afficher");
            System.out.println("4. Quitter");
            System.out.println("Choix");
            Choix = scanner.nextInt();
            scanner.nextLine(); // Vider le buffer

            switch (Choix){
                case 1 -> ajouterMembre();
                case 2 -> supprimerMembre();
                case 3 -> afficherMembres();
                case 4 -> System.out.println("Au revoir!");
                default -> System.out.println("Choix Invalide");
            }
        } while (Choix != 4);
    }

    private static void ajouterMembre(){
        System.out.println("Entrez le nom: ");
        String nom = scanner.nextLine();
        System.out.println("Entrez le prenom: ");
        String prenom = scanner.nextLine();

        Person p = new Person(nom, prenom);
        if(participant.add(p)) {
            System.out.println("Membre ajouter avec succés !");
        }else {
            System.out.println("Ce membre existe déjà");
        }

    }

    private static void supprimerMembre(){
        System.out.println("Entez le nom du membre à supprimer: ");
        String nom = scanner.nextLine();
        System.out.println("Entez le prénom du membre à supprimer: ");
        String prenom = scanner.nextLine();

        Person p = new Person(nom, prenom);
        if(participant.remove(p)) {
            System.out.println("Membre supprimer avec succés !");
        }else {
            System.out.println("Ce membre n'existe pas");
        }
    }

    private static void afficherMembres(){
        if (participant.isEmpty()) {
            System.out.println("Aucun membre enregistré !");
        }else {
            System.out.println("Liste des participants");
            for (Person p: participant){
                System.out.println("-" + p);
            }
        }
    }

}