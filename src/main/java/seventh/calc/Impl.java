package seventh.calc;

public class Impl implements Calc{

    @Override
    public double division(int a, int b) {
        double result;
        result = a / b;
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

    @Override
    public char testChar(char c) {
        return c;
    }


}
