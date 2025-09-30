package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class zooManagement {
    public static void main(String[] args) {
        Animal lyon = new Animal("lyon", "Simba", 6, true);
        Zoo myZoo = new Zoo("Belvedaire", "Tunis");

        System.out.println("Welcome to the Zoo management system");
        myZoo.displayZoo();

        // 🔹 Ajout d'animaux
        Animal tiger = new Animal("tiger", "Bagira", 8, true);
        Animal elephant = new Animal("elephant", "Dumbo", 12, true);

        myZoo.addAnimal(lyon);
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(elephant);

        // 🔹 Afficher les animaux
        System.out.println("\n--- Liste des animaux du zoo ---");
        myZoo.displayAnimals();

        // 🔹 Test recherche
        System.out.println("\nRecherche de Simba :");
        int index = myZoo.searchAnimal(lyon);
        System.out.println("Résultat : " + index);

        // 🔹 Ajouter un autre animal identique
        Animal simba2 = new Animal("lyon", "Simba", 6, true);
        int index2 = myZoo.searchAnimal(simba2);
        System.out.println("Résultat recherche de Simba2 : " + index2);

        boolean addedSimba2 = myZoo.addAnimal(simba2);
        System.out.println("\nAjout d'un deuxième Simba : " + addedSimba2);

        System.out.println("\nSuppression de Dumbo : " + myZoo.removeAnimal(elephant));
        System.out.println("\n--- Liste après suppression ---");
        myZoo.displayAnimals();

        System.out.println("\nZoo plein ? " + myZoo.isZooFull());

        Zoo zoo2 = new Zoo("Friguia", "Hammamet");
        zoo2.addAnimal(new Animal("lion", "Nala", 4, true)); // 1 animal

        Zoo bigger = Zoo.comparerZoo(myZoo, zoo2);
        System.out.println("\nLe zoo avec le plus d'animaux est : " + bigger.getName());
    }
}
