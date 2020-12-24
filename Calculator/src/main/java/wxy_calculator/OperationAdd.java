package zxd_calculator;

public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        return getNumberA()+getNumberB();
    }
}
