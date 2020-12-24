package zxd_calculator;

import java.lang.reflect.InvocationTargetException;

public class OperationFactoy {
    public static Operation creatOpera(String operator)
    {
        Operation o=null;
        try {
            o = (Operation) Class.forName("zxd_calculator.Operation" + operator)
                    .getConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return o;
    }
}
