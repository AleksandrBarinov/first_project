package third;

import java.util.Scanner;

public class ThirdLauncher {
    public static void main(String[] args){
        System.out.println("Для запуска калькулятора введите 1, для запуска массива введите 2");
        Scanner scanner = new Scanner(System.in);
        int chose = scanner.nextInt();
        if (chose==1){
        Calc thisCalc = new Calc();
        thisCalc.calcCode();
        }
        if (chose==2){
        Mass thisMass = new Mass();
        thisMass.massCode();
        }

    }
}