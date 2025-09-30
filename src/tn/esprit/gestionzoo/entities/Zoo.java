package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private static final int NBR_CAGES = 25;
    private int nbAnimals; // compteur d'animaux

    // Constructeur vide
    public Zoo() {
        this.animals = new Animal[NBR_CAGES];
        this.nbAnimals = 0;
    }

    // Constructeur avec nom et ville
    public Zoo(String name, String city) {
        this.animals = new Animal[NBR_CAGES];
        setName(name);
        this.city = city;
        this.nbAnimals = 0;
    }

    // Getter et Setter pour name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            this.name = "Unnamed Zoo";
        } else {
            this.name = name;
        }
    }

    // Getter et Setter pour city
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbAnimals() {
        return nbAnimals;
    }

    // Afficher le zoo
    public void displayZoo() {
        System.out.println("Zoo name: " + name + ", City: " + city +
                ", Cages: " + NBR_CAGES + ", Animals: " + nbAnimals);
    }

    // Ajouter un animal
    public boolean addAnimal(Animal animal) {
        if (animal == null || animal.getName() == null) return false;
        if (isZooFull()) return false;

        for (int i = 0; i < nbAnimals; i++) {
            if (animals[i] != null && animals[i].getName().equals(animal.getName())) {
                return false; // animal déjà présent
            }
        }

        animals[nbAnimals] = animal;
        nbAnimals++;
        return true;
    }

    // Afficher tous les animaux
    public void displayAnimals() {
        if (nbAnimals == 0) {
            System.out.println("No animals in the zoo.");
        } else {
            for (int i = 0; i < nbAnimals; i++) {
                animals[i].displayAnimal();
            }
        }
    }

    // Rechercher un animal
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbAnimals; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    // Supprimer un animal
    public boolean removeAnimal(Animal animal) {
        if (animal == null || animal.getName() == null) return false;

        int index = searchAnimal(animal);
        if (index == -1) return false;

        for (int i = index; i < nbAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbAnimals - 1] = null;
        nbAnimals--;
        return true;
    }

    // Vérifier si le zoo est plein
    public boolean isZooFull() {
        return nbAnimals >= NBR_CAGES;
    }

    // Comparer deux zoos
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1 == null) return z2;
        if (z2 == null) return z1;
        return z1 ;}}

