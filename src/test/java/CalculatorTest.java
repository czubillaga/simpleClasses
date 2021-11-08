import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void canAdd() {
        assertEquals(5, calculator.add(3, 2));
    }

    @Test
    public void canSubtract() {
        assertEquals(9, calculator.subtract(12, 3));
    }

    @Test
    public void canMultiply() {
        assertEquals(15, calculator.multiply(5, 3));
    }

    @Test
    public void canDivide() {
        assertEquals(2.5, calculator.divide(5.0, 2.0), 0.0);
    }
}
