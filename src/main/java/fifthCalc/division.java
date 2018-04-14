package fifthCalc;

import java.util.Scanner;

public class division extends numbers {
    public double doDivision(){

        Scanner scanner = new Scanner(System.in);

        if (operationWithResult == false) {
            //ввод чисел в консоль
            System.out.println("enter the number A: ");
            setA(scanner.nextDouble());
            System.out.println("enter the number B: ");
            setB(scanner.nextDouble());
            //выполнение операции

            res = getA() / getB();
            setRes(res);
        }

        if (operationWithResult == true) {
            System.out.println("enter the number B: ");
            setB(scanner.nextDouble());
            res =  tmpRes / getB();
        }
        return getRes();
    }
}