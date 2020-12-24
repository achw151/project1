import org.junit.jupiter.api.Test;
import zxd_calculator.Operation;
import zxd_calculator.OperationSub;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperationSubTests {
    @Test
    void test_sub_operation() throws Exception {
        Operation operation =new OperationSub();
        operation.setNumberA(10);
        operation.setNumberB(2);
        assertEquals(8,operation.getResult());
    }
}
