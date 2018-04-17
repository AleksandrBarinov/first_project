package seventh.calc;

public class CustomException extends Exception{

    public CustomException(String message) {
        super(message);
        System.out.print(" is my custom Exception \n");
    }
}
