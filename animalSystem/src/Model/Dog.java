package Model;

import java.util.Scanner;

public class Dog extends Pets{
    @Override
    void sleep() {
        System.out.println("Собака " + name + " свернулась колачиком и уснула.");
    }

    @Override
    void eat() {
        System.out.println("Собака " + name + " подбежала к миске и жадно начала кушать");
    }

    @Override
    void voice() {
        System.out.println("Собака " + name + " начала громко гавкать: Гав-гав");
    }

    @Override
    String getName() {
        return name;
    }
    public static Pets createDog() {
        Dog dog = new Dog();
        setCommonProperties(dog);
        System.out.println("Введите породу собаки: ");
        dog.breed = new Scanner(System.in).nextLine();
        System.out.println("Создана собака: " + dog.name + ", порода: " + dog.breed);
        return dog;
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

