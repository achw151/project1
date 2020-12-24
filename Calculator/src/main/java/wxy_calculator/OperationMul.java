package zxd_calculator;

public class OperationMul extends Operation {
    @Override
    public double getResult() throws Exception {
        return getNumberA()*getNumberB();
    }
}
