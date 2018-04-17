package seventh.calc;

public class Impl implements Calc{

    @Override
    public double division(int a, int b) {
        double result = 0;
        try {
                result = a / b;
        }catch(ArithmeticException e){
            if (b == 0){
                System.out.println("division by zero");
            }
            System.out.println("ArithmeticException");
        }
        return result;
    }

    @Override
    public int multiplication(int a, int b) {
        int result = a * b;
        return result;
    }

    @Override
    public int subtraction(int a, int b) {
        int result = a - b;
        return result;
    }

    @Override
    public int addition(int a, int b) {
        int result = a + b;
        return result;
    }

}
