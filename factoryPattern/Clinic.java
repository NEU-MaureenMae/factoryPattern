package factoryPattern;

import java.util.Scanner;

public class Clinic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("[1] Dog");
            System.out.println("[2] Cat");
            System.out.println("[3] Exit");
            System.out.print("\nChoose your pet number: ");
            Integer choice = input.nextInt();

            PetRecord petFile = new PetRecord();
            Pet pet = null;

            switch (choice) {
                case 1:
                    pet = new Dog();
                    petFile.setPetId("D01");
                    petFile.setPetName("Bantay");
                    petFile.setPet(pet);
                    ((Dog) pet).setBreed("German Shepherd");
                    break;
                case 2:
                    pet = new Cat();
                    petFile.setPetId("C01");
                    petFile.setPetName("Muning");
                    petFile.setPet(pet);
                    ((Cat) pet).setNoOfLives(9);
                    break; // Add a break statement here to exit the switch
                case 3:
                    System.exit(0);
            }

            System.out.println("Pet id is " + petFile.getPetId());
            System.out.println("Pet name is " + petFile.getPetName());
            System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
            System.out.println("Communication sound: " + petFile.getPet().makeSound());
            System.out.println("Play mode: " + petFile.getPet().play());

            if (choice == 1) {
                System.out.println("Pet breed: " + ((Dog) pet).getBreed());
            }
            if (choice == 2) {
                System.out.println("Number of lives: " + ((Cat) pet).getNoOfLives());
            }
        }
    }
}
