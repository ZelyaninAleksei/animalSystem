package View;

import Controller.InputControl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static Model.Animal.getTotalAnimals;
import static Model.AnimalCreator.createPackAnimals;
import static Model.AnimalCreator.createPets;

public class Menu {

    private static List<String> commands = new ArrayList<>(Arrays.asList("сидеть", "лежать", "голос"));


    public void mainMenu(Scanner sc) {
        int choice;

        do {
            System.out.println("Меню");
            System.out.println("1. Завести новое животное");
            System.out.println("2. Cписок команд");
            System.out.println("3. Обучить новым командам");
            System.out.println("4. Счетчик животных");
            System.out.println("5. Выход.");
            System.out.println("Введите номер пункта меню: ");

            choice = InputControl.getInput(5);

            switch (choice) {
                case 1:
                    subMenu();
                    break;
                case 2:
                    System.out.println("Список команд:");
                    printCommands();
                    break;
                case 3:
                    teachNewCommands();
                    break;
                case 4:
                    System.out.println("Всего создано животных " + getTotalAnimals());
                    break;
                case 5:
                    System.out.println("5. Выход.");
                    break;
                default:
                    System.out.println("Некорректный выбор. Пожалуйста, повторите.");
            }
        } while (choice != 5);
    }

    private void subMenu() {
        int choiceSub;

        do {
            System.out.println("Выберите класс животного:");
            System.out.println("1. Домашние животные");
            System.out.println("2. Вьючные животные");
            System.out.println("3. Вернуться в главное меню");

            choiceSub = InputControl.getInput(3);

            switch (choiceSub) {
                case 1:
                    createPets();
                    break;
                case 2:
                    createPackAnimals();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Некорректный выбор. Пожалуйста, повторите.");
            }
        } while (choiceSub != 3);
    }

    private void printCommands() {
        for (String command : commands) {
            System.out.println(command);
        }
    }

    private void teachNewCommands() {
        System.out.println("Обучение новым командам...");
        System.out.println("Введите новую команду");
        Scanner sc = new Scanner(System.in);
        String newCommand = sc.next();
        commands.add(newCommand);
    }
}
