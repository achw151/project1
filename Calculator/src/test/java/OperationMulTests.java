import org.junit.jupiter.api.Test;
import zxd_calculator.Operation;
import zxd_calculator.OperationMul;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperationMulTests {
        @Test
        void test_mul_operation() throws Exception {
            Operation operation =new OperationMul();
            operation.setNumberA(10);
            operation.setNumberB(2);
            assertEquals(20,operation.getResult());
        }
}
