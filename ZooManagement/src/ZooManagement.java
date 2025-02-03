// Importation de la classe Scanner pour permettre les entrées utilisateur
import java.util.Scanner;
public class ZooManagement {

        public static void main(String[] args) {
            // Instruction 1 : Déclaration et initialisation des variables
            //int nbrCages = 20;
            //String zooName = "my zoo";

            // Affichage du message initial
            //System.out.println(zooName + " comporte " + nbrCages + " cages");

            // Instruction 2 : Donner la main à l'utilisateur pour saisir les données
            //Scanner scanner = new Scanner(System.in);

            // Demande du nom du zoo
            //System.out.print("Veuillez entrer le nom du zoo : ");
            //zooName = scanner.nextLine();

            // Demande du nombre de cages avec vérification de la validité
            //System.out.print("Veuillez entrer le nombre de cages : ");
            //while (!scanner.hasNextInt()) {
            //    System.out.println("Entrée invalide. Veuillez entrer un nombre entier.");
             //   scanner.next(); // Consommer l'entrée invalide
            //}
            //nbrCages = scanner.nextInt();

            // Instruction 3 : Affichage des changements
            //System.out.println(zooName + " comporte " + nbrCages + " cages");

            // Fermeture du scanner
           // scanner.close();
            Animal lion = new Animal();
            lion.name = "Simba";
            lion.age = 8;
            lion.family = "Cats";
            lion.isMammal = true;

            Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
            Animal dog = new Animal("Canine", "Snoopy", 2, true);
            Animal dog3 = new Animal("Canine", "Snoopy", 2, true);

            Animal girafe = new Animal("Melman", "Girafe", 7,true);

            System.out.println(myZoo.searchAnimal(dog));
            Animal dog2 = new Animal("Canine", "lll", 2, true);
            System.out.println(myZoo.searchAnimal(dog2));

            myZoo.displayZoo();

            System.out.println(myZoo);
            System.out.println(myZoo.toString());

            myZoo.addAnimal(lion);
            myZoo.addAnimal(dog);
            myZoo.addAnimal(dog2);
            myZoo.addAnimal(dog3);
            myZoo.addAnimal(girafe);

            myZoo.displayAnimals();

            System.out.println("a" + myZoo.removeAnimal(lion));
            myZoo.displayAnimals();
            System.out.println("a" + myZoo.removeAnimal(dog2));
            myZoo.displayAnimals();
            System.out.println("a" + myZoo.removeAnimal(dog));
            myZoo.displayAnimals();


            //        System.out.println(Zoo.comparerZoo(myZoo, notMyZoo));
//        System.out.println(myZoo.isZooFull());


        }
    }
