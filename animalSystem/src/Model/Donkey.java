package Model;

import java.util.Scanner;

public class Donkey extends PackAnimals{
    void sleep() {
        System.out.println("Осёл " + name + " уснул на ходу.");
    }

    @Override
    void eat() {
        System.out.println("Осёл " + name + " съела вкусную морковку");
    }

    @Override
    void voice() {
        System.out.println("Осёл " + name + " прокричал: Иа!");
    }

    @Override
    String getName() {
        return name;
    }
    public static PackAnimals createDonkey() {
        Donkey donkey = new Donkey();
        setCommonProperties(donkey);
        System.out.println("Введите породу ослика: ");
        donkey.breed = new Scanner(System.in).nextLine();
        System.out.println("Создан осёл: " + donkey.name + ", порода: " + donkey.breed);
        return donkey;
    }

    private static void setCommonProperties(Donkey packAnimals) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя животного: ");
        packAnimals.name = scanner.nextLine();
        System.out.println("Введите дату рождения животного: ");
        packAnimals.dateOfBirth = scanner.nextLine();
        System.out.println("Введите вес животного: ");
        packAnimals.weight = scanner.nextDouble();
    }
}

