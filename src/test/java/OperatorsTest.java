import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperatorsTest {

    @Test
    void add() {
        assertEquals(4, Operators.Add(2, 2));
    }

    @Test
    void subtract() {
        assertEquals(10, Operators.Subtract(34, 24));
    }

    @Test
    void multiply() {
        assertEquals(20, Operators.Multiply(4, 5));
    }

    @Test
    void divide() {
        assertEquals(3, Operators.Divide(27, 9));
    }
}