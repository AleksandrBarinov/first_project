package seventh.calc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws CustomException {
        boolean firstStart = true;
        boolean continueToCalc = true;
        int result = 0;
        int switcher = 1;
        String a;
        String b;
        while (continueToCalc == true) {
            Scanner scanner = new Scanner(System.in);
            if (firstStart == false) {
                System.out.println("current result is [" + result + "] \n ***************************** \n operation with result ?");
                System.out.println("(type 0 for yes, \n any Numbers for operation with A [ ] B)");

                Service switcherService = new Service();
                switcherService.makeOperationWithResultSwitcher();

                switcher = switcherService.getSwitcherIn();

            }

            firstStart = false;

            if (switcher == 0) {

                System.out.println("current operation is: " + result + " [ ] B");
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
                Service charTest = new Service();
                charTest.makeOperationChar(c);

                switch (c){
                    case '+':
                        Service add = new Service();
                        result = add.addition(a,b);
                        break;

                    case '-':
                        Service sub = new Service();
                        result = sub.subtraction(a,b);
                        break;

                    case '/':
                        Service div = new Service();
                        result = (int) div.division(a, b);
                        break;

                    case '*':
                        Service mul = new Service();
                        result = mul.multiplication(a,b);
                        break;
                    case  'q':
                        System.out.println("process stopped");
                        continueToCalc = false;


                }


            }


        }

    }
