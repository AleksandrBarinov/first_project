package seventh.calc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Service {


    public double division(String a, String b) throws CustomException{
        double result = 0;
        try {
            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);
            Impl div = new Impl();
            result = div.division(x, y);
        } catch (NumberFormatException e) {
            System.out.print("Not numbers \n");
            throw new CustomException("Not numbers");
        } catch(ArithmeticException e){
            int x = Integer.parseInt(b);
            if (x == 0){
                System.out.print("division by zero \n");
                throw new CustomException("division by zero");
            }
            System.out.println("ArithmeticException");
        }
        return result;
    }


    public int multiplication(String a, String b) throws CustomException{
        int result = 0;
        try {
            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);
            Impl mul = new Impl();
            result = mul.multiplication(x, y);
        } catch (NumberFormatException e) {
            System.out.print("Not numbers \n");
            throw new CustomException("Not numbers");
        }
        return result;
    }


    public int subtraction(String a, String b) throws CustomException{
        int result = 0;
        try {
            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);
            Impl sub = new Impl();
            result = sub.subtraction(x, y);
        } catch (NumberFormatException e) {
            System.out.print("Not numbers \n");
            throw new CustomException("Not numbers");
        }
        return result;
    }


    public int addition(String a, String b) throws CustomException {
        int result = 0;
        try {
            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);
            Impl add = new Impl();
            result = add.addition(x, y);
        } catch (NumberFormatException e) {
            System.out.print("Not numbers \n");
            throw new CustomException("Not numbers");
        }
        return result;
    }

    public void makeOperationChar(char c) throws CustomException {
            if (!(c == '+' || c == '-' || c == '/' || c == '*' || c == 'q')) {
            System.out.print("wrong symbol \n");
            throw new CustomException("wrong symbol");
        } else {
                Impl retChar = new Impl();
                retChar.testChar(c);
            }
    }
    int switcherIn;

    public int getSwitcherIn() {
        return switcherIn;
    }

    public void makeOperationWithResultSwitcher() throws CustomException {
            try {

                Scanner scanner = new Scanner(System.in);
                switcherIn = scanner.nextInt();

            } catch (InputMismatchException e){
                System.out.print("Not numbers \n");
                throw new CustomException("Not numbers");
            }
    }
}
