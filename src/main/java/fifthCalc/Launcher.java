package fifthCalc;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        boolean continueOperation = true;
        double tmpRes = 0;

        while (continueOperation == true){
            System.out.println("current result of operation is " + tmpRes);
            System.out.println("***********************************");
            System.out.println("choose operation (+ - / *) ");

            Scanner scanner = new Scanner(System.in);
            char chooseOperation = scanner.next().charAt(0);

            switch (chooseOperation){

                case '+':

                    addition add = new addition();
                    System.out.println("operation A " + chooseOperation + " B is selected");
                        System.out.println("operation with result ? (" + tmpRes + ")");
                        System.out.println("(type 0 for yes, any numbers for operation with A " + chooseOperation + " B)");
                        int addSwitcher = scanner.nextInt();
                        if (addSwitcher==0){
                            add.operationWithResult = true;
                            System.out.println("current operation is: " + tmpRes + " " + chooseOperation + " B");
                        }
                    add.setTmpRes(tmpRes);
                    add.doAddition();
                    tmpRes = add.getRes();
                    break;

                case '-':

                    substraction sub = new substraction();
                    System.out.println("operation A " + chooseOperation + " B is selected");
                        System.out.println("operation with result ? (" + tmpRes + ")");
                        System.out.println("(type 0 for yes, any numbers for operation with A " + chooseOperation + " B)");
                        int subSwitcher = scanner.nextInt();
                        if (subSwitcher==0){
                            sub.operationWithResult = true;
                            System.out.println("current operation is: " + tmpRes + " " + chooseOperation + " B");
                        }
                    sub.setTmpRes(tmpRes);
                    sub.doSubstraction();
                    tmpRes = sub.getRes();
                    break;

                case '/':

                    division div = new division();
                    System.out.println("operation A " + chooseOperation + " B is selected");
                        System.out.println("operation with result ? (" + tmpRes + ")");
                        System.out.println("(type 0 for yes, any numbers for operation with A " + chooseOperation + " B)");
                        int divSwitcher = scanner.nextInt();
                        if (divSwitcher==0){
                            div.operationWithResult = true;
                            System.out.println("current operation is: " + tmpRes + " " + chooseOperation + " B");
                        }
                    div.setTmpRes(tmpRes);
                    div.doDivision();
                    tmpRes = div.getRes();
                    break;

                case '*':

                    multiplication mul = new multiplication();
                    System.out.println("operation A " + chooseOperation + " B is selected");
                        System.out.println("operation with result ? (" + tmpRes + ")");
                        System.out.println("(type 0 for yes, any numbers for operation with A " + chooseOperation + " B)");
                        int mulSwitcher = scanner.nextInt();
                        if (mulSwitcher==0){
                            mul.operationWithResult = true;
                            System.out.println("current operation is: " + tmpRes + " " + chooseOperation + " B");
                        }
                    mul.setTmpRes(tmpRes);
                    mul.doMultiplication();
                    tmpRes = mul.getRes();
                    break;

                case 'q':
                    continueOperation = false;
                    System.out.println("process stopped");

            }
        }
    }
}
