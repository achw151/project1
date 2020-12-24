import org.junit.jupiter.api.Test;
import zxd_calculator.Operation;
import zxd_calculator.OperationAdd;
import zxd_calculator.OperationMul;
import zxd_calculator.OperationSqrt;

import javax.management.OperationsException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OprerationSqrtTests {
    @Test
    void test_sqrt_operation() throws Exception {
        Operation operation=new OperationSqrt();
        operation.setNumberA(2);
        assertEquals(Math.sqrt(2),operation.getResult());
    }
    @Test
    void test_sqrt_negative() throws Exception {
        Operation operation=new OperationSqrt();
        operation.setNumberA(-1);
        Exception exception=assertThrows(Exception.class,operation::getResult);
        assertEquals("负数不能开平方根",exception.getMessage());
    }

}
