package zxd_calculator;

public class OperationSub extends Operation {
    @Override
    public double getResult() {
        return getNumberA()-getNumberB();
    }
}
