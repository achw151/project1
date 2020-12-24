import org.junit.jupiter.api.Test;
import zxd_calculator.Operation;
import zxd_calculator.OperationDiv;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperationDivTests {
    @Test
    void test_div_operation() throws Exception {
        Operation operation =new OperationDiv();
        operation.setNumberA(10);
        operation.setNumberB(2);
        assertEquals(5,operation.getResult());
    }
}
