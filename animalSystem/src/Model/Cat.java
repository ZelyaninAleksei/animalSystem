package Model;

import java.util.Scanner;

public class Cat extends Pets{

    @Override
    void sleep() {
        System.out.println("Кошка " + name + " легла на печку и уснула.");
    }

    @Override
    void eat() {
        System.out.println("Кошка " + name + " поймала мышку и скушала");
    }

    @Override
    void voice() {
        System.out.println("Кошка " + name + " начала петь: МЯЯЯЯУУУУ!");
    }

    @Override
    String getName() {
        return name;
    }

    public static Pets createCat() {
        Cat cat = new Cat();
        setCommonProperties(cat);
        System.out.println("Введите породу кошки: ");
        cat.breed = new Scanner(System.in).nextLine();
        System.out.println("Создана кошка: " + cat.name + ", порода: " + cat.breed);
        return cat;
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

