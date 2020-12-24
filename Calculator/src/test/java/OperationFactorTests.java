import org.junit.jupiter.api.Test;
import zxd_calculator.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OperationFactorTests {

    @Test
    void creat_add_operation() throws Exception {
        Operation operation = OperationFactoy.creatOpera("Add");
        assertTrue(operation instanceof OperationAdd);
    }

    @Test
    void creat_sub_operation() throws Exception {
        Operation operation = OperationFactoy.creatOpera("Sub");
        assertTrue(operation instanceof OperationSub);
    }

    @Test
    void creat_mul_operation() throws Exception {
        Operation operation = OperationFactoy.creatOpera("Mul");
        assertTrue(operation instanceof OperationMul);
    }

    @Test
    void creat_div_operation() throws Exception {
        Operation operation = OperationFactoy.creatOpera("Div");
        assertTrue(operation instanceof OperationDiv);
    }

    @Test
    void creat_sqrt_operation() throws Exception {
        Operation operation = OperationFactoy.creatOpera("Sqrt");
        assertTrue(operation instanceof OperationSqrt);
    }
}

