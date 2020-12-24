package zxd_calculator;

public class OperationSqrt extends Operation{
    @Override
    public double getResult() throws Exception {
        if(getNumberA()<0) throw new Exception("负数不能开平方根");
        return Math.sqrt(getNumberA());
    }
}
