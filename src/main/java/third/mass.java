package third;
/**
 * text array
 * @author Aleksandr Barinov
 * @version 0.2
 * @see
 */

import java.util.Scanner;

public class mass {
    public void massCode (){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число элементов в массиве: ");

        int c = scanner.nextInt();//Ввод переменной, отвечающей за количество элементов
        String[] arrText = new String[c];//Объявление массива
        int lengthMax = 0;
        int numMax = 0;
        int countOfMaxs = 0;

        System.out.println("Введите поочередно каждый из элементов,");
        System.out.println("будет посчитана максимальная длина элемента");
        System.out.println("********************************************");

        for (int i=0; i < c; i++){

            arrText[i] = scanner.next();//Ввод в консоль каждого из элементов массива

            if (arrText[i].length() > lengthMax)//Условие, с помощью которого считается максимум

            {lengthMax = arrText[i].length(); numMax = i; countOfMaxs = 1;}

            else if (arrText[i].length() == lengthMax) {countOfMaxs = countOfMaxs + 1;}

        }

        for (int i=0; i < c; i++){
            System.out.println("№ " + (i + 1)+ ": " + arrText[i]);//Вывод на экран всех элементов массива
        }
        System.out.println("********************************************");

        if (countOfMaxs == 1) //Вывод результата в случае, если максимальный элемент один
        {System.out.println("У элемента № " + ++numMax + " максимальная длина");
            System.out.println("Она составляет " + lengthMax + " символов");}

        else if (countOfMaxs > 1) //Вывод результата в случае, если максимальных элементов несколько
        {System.out.println("В массиве несколько (" + countOfMaxs + ") элементов, с одинаковым количеством символов");}
    }

    public void twoM() {
    }
}
