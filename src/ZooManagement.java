import java.util.Scanner;

public class ZooManagement {
   // int nbrCages = 20;
  //  String zooName = "my zoo";


        public static void main(String[] args) {
          /*  ZooManagement zoo = new ZooManagement();
            // System.out.printf(zoo.zooName+ "comporte" + zoo.nbrCages+"cages");
            Scanner scanner = new Scanner(System.in);
            do{
                // Lire une chaîne
                System.out.print("Entrez le nom du zoo : ");
                zoo.zooName = scanner.nextLine();  // met à jour la variable dans l'objet
            } while (zoo.zooName.equals(""));  // continuer tant que ce n’est pas vide

            do{
                System.out.print("entrer le nombres de cages");
                zoo.nbrCages = scanner.nextInt();  // lit un entier
            } while(zoo.nbrCages<0);
            System.out.print(zoo.zooName +"comporte"+zoo.nbrCages);
        }*/
            Animal lion = new Animal();
            lion.family = "Felidae";
            lion.name = "Lion";
            lion.age = 5;
            lion.isMammal = true;

            // Création d’un zoo
            Zoo myZoo = new Zoo();
            myZoo.name = "My Zoo";
            myZoo.city = "Sousse";
            myZoo.nbrCages = 25;

            // Exemple d’affichage
            System.out.println("Animal : " + lion.name + " | Famille : " + lion.family);
            System.out.println("Zoo : " + myZoo.name + " | Ville : " + myZoo.city + " | Nombre de cages : " + myZoo.nbrCages);
        }




}
