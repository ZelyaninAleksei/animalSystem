package Model;

import java.util.Scanner;

public class Camels extends PackAnimals {

    void sleep() {
        System.out.println("Верблюд " + name + " лег на бархан и уснул.");
    }

    @Override
    void eat() {
        System.out.println("Верблюд " + name + " съел колючки");
    }

    @Override
    void voice() {
        System.out.println("Верблюд " + name + " не стал говорить и просто плюнул");
    }

    @Override
    String getName() {
        return name;
    }
    public static PackAnimals createCamel() {
        Camels camels = new Camels();
        setCommonProperties(camels);
        System.out.println("Введите породу верблюда: ");
        camels.breed = new Scanner(System.in).nextLine();
        System.out.println("Создана лошадь: " + camels.name + ", порода: " + camels.breed);
        return camels;
    }

    private static void setCommonProperties(Camels packAnimals) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя животного: ");
        packAnimals.name = scanner.nextLine();
        System.out.println("Введите дату рождения животного: ");
        packAnimals.dateOfBirth = scanner.nextLine();
        System.out.println("Введите вес животного: ");
        packAnimals.weight = scanner.nextDouble();
    }
}

