package seventh.calc;

public interface Calc {

     double division(int a, int b) throws CustomException;

     int multiplication(int a, int b) throws CustomException;

     int subtraction(int a, int b) throws CustomException;

     int addition(int a, int b) throws CustomException;

     char testChar(char c) throws CustomException;

}