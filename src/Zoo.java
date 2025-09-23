public class Zoo {
    Animal[] animals;
    String name;
    String city;
    private static final int NBR_CAGES = 25;
    int nbAnimals; // compteur

    Zoo() {
        this.animals = new Animal[NBR_CAGES];
        this.nbAnimals = 0;
    }

    Zoo(String name, String city) {
        this.animals = new Animal[NBR_CAGES];
        this.name = name;
        this.city = city;
        this.nbAnimals = 0;
    }

    public void displayZoo() {
        System.out.println("Zoo name: " + name + ", City: " + city + ", Cages: " + NBR_CAGES + ", Animals: " + nbAnimals);
    }

   /* public boolean addAnimal(Animal animal) {
        if (animal == null) return false;
        if (nbAnimals >= nbrCages) return false; // zoo plein

        animals[nbAnimals] = animal;
        nbAnimals++;
        return true;
    }  */

    // 🔹 Instruction 11 : afficher les animaux
    public void displayAnimals() {
        if (nbAnimals == 0) {
            System.out.println("No animals in the zoo.");
        } else {
            for (int i = 0; i < nbAnimals; i++) {
                animals[i].displayAnimal();
            }
        }
    }

    // 🔹 Instruction 11 : rechercher un animal
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbAnimals; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i; // trouvé
            }
        }
        return -1; // pas trouvé
    }



    // Instruction 12 - addAnimal avec vérification d'unicité
    public boolean addAnimal(Animal animal) {
        if (animal == null || animal.name == null) return false;

        // Vérifier capacité
        if (nbAnimals >= NBR_CAGES) return false;

        // Vérifier doublon par nom
        for (int i = 0; i < nbAnimals; i++) {
            if (animals[i] != null && animals[i].name.equals(animal.name)) {
                return false;
            }
        }

        animals[nbAnimals] = animal;
        nbAnimals++;
        return true;
    }


    // Instruction 13 - supprimer un animal
    public boolean removeAnimal(Animal animal) {
        if (animal == null || animal.name == null) return false;

        int index = searchAnimal(animal);
        if (index == -1) return false; // pas trouvé


        for (int i = index; i < nbAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbAnimals - 1] = null;
        nbAnimals--;
        return true;






    }
    // Instruction 15
    public boolean isZooFull() {
        return nbAnimals >= NBR_CAGES;
    }

    // Instruction 16 - comparer deux zoos
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1 == null) return z2;
        if (z2 == null) return z1;
        return (z1.nbAnimals >= z2.nbAnimals) ? z1 : z2;
    }


}


