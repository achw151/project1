package zxd_calculator;

public abstract class Operation {
    private double numberA;
    private double numberB;

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }
    public abstract  double getResult() throws Exception;
}
