import org.junit.jupiter.api.Test;
import zxd_calculator.Operation;
import zxd_calculator.OperationAdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperationAddTests {

    @Test
    void test_add_operation() throws Exception {
        Operation operation =new OperationAdd();
        operation.setNumberA(1);
        operation.setNumberB(2);
        assertEquals(3,operation.getResult());
    }
}
