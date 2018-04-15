package fifth.calc;

public class Numbers {
    //класс, от которого будут наследоваться операции
    public boolean operationWithResult = false;

    double tmpRes;

    public void setTmpRes(double tmpRes) {
        this.tmpRes = tmpRes;
    }

    double a;
    double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }

    double res;
}
