package seventh.calc;

public class Service {


    public double division(String a, String b) {
        double result = 0;
        try {
            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);
            Impl div = new Impl();
            result = div.division(x, y);
        } catch (NumberFormatException e) {
            System.out.println("Not numbers");
        }
        return result;
    }


    public int multiplication(String a, String b) {
        int result = 0;
        try {
           int x = Integer.parseInt(a);
           int y = Integer.parseInt(b);
            Impl mul = new Impl();
            result = mul.multiplication(x, y);
        } catch (NumberFormatException e) {
            System.out.println("Not numbers");
        }
        return result;
    }


    public int subtraction(String a, String b) {
       int result = 0;
        try {
            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);
            Impl sub = new Impl();
            result = sub.subtraction(x, y);
        } catch (NumberFormatException e) {
            System.out.println("Not numbers");
        }
        return result;
    }


    public int addition(String a, String b) {
        int result=0;
        try {
            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);
            Impl add = new Impl();
            result = add.addition(x, y);
        } catch (NumberFormatException e) {
            System.out.println("Not numbers");
        }
        return result;
    }

}
