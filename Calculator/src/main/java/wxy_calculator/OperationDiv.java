package zxd_calculator;

public class OperationDiv extends Operation {
    @Override
    public double getResult() throws Exception {
        if(getNumberB()==0)
        {
            throw new Exception("除数不能为零");

        }
        return getNumberA()/getNumberB();
    }
}
