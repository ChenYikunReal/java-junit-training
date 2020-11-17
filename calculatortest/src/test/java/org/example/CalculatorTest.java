package org.example;

import static org.junit.Assert.assertTrue;

import junit.framework.TestCase;
import org.junit.Test;

public class CalculatorTest extends TestCase {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        double a = 1.2, b = 2.3, c = 3.5;
        double result = calculator.add(a, b);
        assertEquals(c, result, 0);
    }

}
