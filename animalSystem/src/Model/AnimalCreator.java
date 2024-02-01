package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Model.Camels.createCamel;
import static Model.Cat.createCat;
import static Model.Dog.createDog;
import static Model.Donkey.createDonkey;
import static Model.Hamster.createHamster;
import static Model.Horse.createHorse;

public class AnimalCreator {

    private static List<Pets> petsList = new ArrayList<>();
    private static List<PackAnimals> packAnimalsList = new ArrayList<>();

    public static void createPets() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите, какое животное вы хотите создать:");
        System.out.println("1. Собака");
        System.out.println("2. Кошка");
        System.out.println("3. Хомяк");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                petsList.add(createDog());
                break;
            case 2:
                petsList.add(createCat());
                break;
            case 3:
                petsList.add(createHamster());
                break;
            default:
                System.out.println("Некорректный выбор.");
        }
    }

    public static void createPackAnimals() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Выберите, какое животное вы хотите создать:");
        System.out.println("1. Лошадь");
        System.out.println("2. Верблюд");
        System.out.println("3. Осёл");

        int choicePA = scan.nextInt();

        switch (choicePA) {
            case 1:
                packAnimalsList.add(createHorse());
                break;
            case 2:
                packAnimalsList.add(createCamel());
                break;
            case 3:
                packAnimalsList.add(createDonkey());
                break;
            default:
                System.out.println("Некорректный выбор.");
        }
    }
    public static List<Pets> getPetsList() {
        return petsList;
    }

    public static List<PackAnimals> getPackAnimalsList() {
        return packAnimalsList;
    }
}
