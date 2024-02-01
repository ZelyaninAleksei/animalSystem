package Model;

import java.util.Scanner;

public class Horse extends PackAnimals{
    void sleep() {
        System.out.println("Лошадь " + name + " уснула на ходу.");
    }

    @Override
    void eat() {
        System.out.println("Лошадь " + name + " съела запрятанный ранее кусочек сахара");
    }

    @Override
    void voice() {
        System.out.println("Лошадь " + name + " усмехнулась: Иго-го");
    }

    @Override
    String getName() {
        return name;
    }
    public static PackAnimals createHorse() {
        Horse horse = new Horse();
        setCommonProperties(horse);
        System.out.println("Введите породу лошади: ");
        horse.breed = new Scanner(System.in).nextLine();
        System.out.println("Создана лошадь: " + horse.name + ", порода: " + horse.breed);
        return horse;
    }

    private static void setCommonProperties(Horse packAnimals) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя животного: ");
        packAnimals.name = scanner.nextLine();
        System.out.println("Введите дату рождения животного: ");
        packAnimals.dateOfBirth = scanner.nextLine();
        System.out.println("Введите вес животного: ");
        packAnimals.weight = scanner.nextDouble();
    }
}

