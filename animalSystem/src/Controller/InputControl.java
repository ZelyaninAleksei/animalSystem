package Controller;

import java.util.Scanner;

public class InputControl {
    private static Scanner sc = new Scanner(System.in);

    public static int getInput(int maxChoice) throws NumberFormatException {
        int choice = 0;
        boolean validInput = true;

        do {
            if (sc.hasNext()) {
                String input = sc.next();
                choice = Integer.parseInt(input.trim());

                if (choice >= 1 && choice <= maxChoice) {
                    validInput = false;
                } else {
                    System.out.println("Некорректный выбор. Пожалуйста, введите число от 1 до " + maxChoice + ".");
                    break;
                }
            } else {
                System.out.println("Возврат в меню.");
                break;
            }
        } while (validInput);

        return choice;
    }
}
