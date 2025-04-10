import org.example.Calc;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalcTest {
    Calc calc = new Calc();

    @Test
    public void testAddition() {
        assertEquals(5, calc.addition(2, 3));
    }

    @Test
    public void testSoustraction() {
        assertEquals(1, calc.soustraction(4, 3));
    }

    @Test
    public void testMultiplication() {
        assertEquals(12, calc.multiplication(3, 4));
    }

    @Test
    public void testDivision() {
        assertEquals(2, calc.division(6, 3));
    }

    @Test
    public void testDivisionParZero() {
        assertThrows(ArithmeticException.class, () -> calc.division(5, 0));
    }
}
