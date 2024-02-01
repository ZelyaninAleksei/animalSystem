package Model;

import java.util.Scanner;

public class Hamster extends Pets{

    @Override
    void sleep() {
        System.out.println("Хомяк " + name + " лениво лёг на пуфик и захрапел.");
    }

    @Override
    void eat() {
        System.out.println("Хомяк " + name + " достал из-за щеки запас еды и схомячил");
    }

    @Override
    void voice() {
        System.out.println("Хомяк " + name + " пропищал: пи-пи-пи...");
    }

    @Override
    String getName() {
        return name;
    }
    public static Pets createHamster() {
        Hamster hamster = new Hamster();
        setCommonProperties(hamster);
        System.out.println("Введите породу хомяка: ");
        hamster.breed = new Scanner(System.in).nextLine();
        System.out.println("Создан хомяк: " + hamster.name + ", порода: " + hamster.breed);
        return hamster;
    }

    private static void setCommonProperties(Pets pet) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя животного: ");
        pet.name = scanner.nextLine();
        System.out.println("Введите дату рождения животного: ");
        pet.dateOfBirth = scanner.nextLine();
        System.out.println("Введите вес животного: ");
        pet.weight = scanner.nextDouble();
    }
}

