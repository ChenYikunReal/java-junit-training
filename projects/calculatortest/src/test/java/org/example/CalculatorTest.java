package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class CalculatorTest extends TestCase {

    @Test
    public void test() {
        int a = 1, b = 2, c = 3, d = -1, e = 0;
        assertEquals(c, Calculator.add(a, b));
        assertEquals(d, Calculator.subtract(a, b));
        assertEquals(b, Calculator.multiply(a, b));
        assertEquals(e, Calculator.divide(a, b));
    }

}
