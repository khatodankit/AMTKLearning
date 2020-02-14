import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest {

    @Test
    public void findFactorial() {
        assertEquals(4 * 3 * 2, new Factorial().findFactorial(4));
        assertEquals(1, new Factorial().findFactorial(1));

        assertEquals(1, new Factorial().findFactorial(0));

    }
}