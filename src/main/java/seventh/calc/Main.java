package seventh.calc;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean firstStart = true;
        boolean continueToCalc = true;
        int result = 0;
        int switcher = 1;
        String a;
        String b;

        while (continueToCalc == true) {

            Scanner scanner = new Scanner(System.in);

            if (firstStart == false) {
                System.out.println("operation with result ? \n ***************************** \n current result is [" + result + "]");
                System.out.println("(type 0 for yes, \n any Numbers for operation with A [ ] B)");
                int switcherSc = scanner.nextInt();
                switcher = switcherSc;

            }

            firstStart = false;

            if (switcher == 0) {

                System.out.println("current operation is: " + result + " [ ] B");
                ;
                System.out.println("type B:");
                String bSc = scanner.next();

                a = Integer.toString(result);
                b = bSc;

            } else {
                System.out.println("current operation is: A [ ] B");
                System.out.println("type A:");
                String aSc = scanner.next();
                System.out.println("type B:");
                String bSc = scanner.next();

                a = aSc;
                b = bSc;
            }

            System.out.println("type symbol of operation [ ] (+,-,*,/)");
            char c = scanner.next().charAt(0);
                System.out.println("result is:");


            if (c == '+' | c == '-' | c == '/' | c == '*' | c == 'q') {
                switch (c){
                    case '+':
                        Service add = new Service();
                        result = add.addition(a,b);
                        System.out.println(result);
                        break;

                    case '-':
                        Service sub = new Service();
                        result = sub.subtraction(a,b);
                        System.out.println(result);
                        break;

                    case '/':
                        Service div = new Service();
                        result = (int) div.division(a, b);
                        System.out.println(result);
                        break;

                    case '*':
                        Service mul = new Service();
                        result = mul.multiplication(a,b);
                        System.out.println(result);
                        break;
                    case  'q':
                        System.out.println("process stopped");
                        continueToCalc = false;


                }

            } else try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("wrong symbol");
                firstStart = true;
            }


        }

    }
}

