package first_second; /**
 * calculator
 * @author Aleksandr Barinov
 * @version 0.2
 * @see base
 */

import java.util.Scanner;

public class Base {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        /**Ввод данных в консоль
         * @see scanner*/
        System.out.println("Введите число a: ");
        double a = scanner.nextDouble();
        System.out.println("Введите число b: ");
        double b = scanner.nextDouble();
        System.out.println("Выберите операцию(1 - сложение, 2 - вычитание, 3 - умножение, 4 - деление): ");
        double c = 0;
        /*Выбор операции с числами*/
        int i = scanner.nextInt();
        if (i == 1)
        { c = a + b;} else if (i == 2){c = a - b;} else if (i == 3){c = a * b;} else if (i == 4){c = a / b;}
        /*Вывод на консоль результата операции*/
        System.out.printf("Результат операции: " + "%20.4f",c);
        scanner.close();

    }
}