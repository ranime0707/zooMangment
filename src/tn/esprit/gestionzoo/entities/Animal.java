package tn.esprit.gestionzoo.entities;

public class Animal {
    private int age;
    private String name;
    private String family;
    private boolean isMammal;

    // Constructeur public
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        setAge(age); // applique la règle pour l'âge
        this.isMammal = isMammal;
    }

    // Constructeur vide public
    public Animal() {}

    // Getter et Setter pour age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0; // ou lever une exception si tu veux
        } else {
            this.age = age;
        }
    }

    // Getter et Setter pour name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter et Setter pour family
    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    // Getter et Setter pour isMammal
    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    // Méthode pour afficher l'animal
    public void displayAnimal() {
        System.out.println("Animal: " + name + ", Family: " + family +
                ", Age: " + age + ", Mammal: " + isMammal);
    }
}
