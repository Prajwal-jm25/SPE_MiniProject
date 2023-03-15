import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import calci.ScientificCalculator;

public class ScientificCalculatorTest{
    @Test
    public void testSqrtTrue(){
        assertEquals(2, ScientificCalculator.sqrt(4), 0);
    }

    @Test
    public void testSqrtFalse(){
        assertNotEquals(3, ScientificCalculator.sqrt(4),0);
    }

    @Test
    public void testFactorialTrue() {
        assertEquals(24, ScientificCalculator.fact(4), 0);
    }

    @Test
    public void testFactorialFalse(){
        assertNotEquals(30, ScientificCalculator.fact(4),0);
    }

    @Test
    public void testLogTrue() {
        assertEquals(1, ScientificCalculator.log(Math.E), 0);
    }

    @Test
    public void testLogFalse(){
        assertNotEquals(3, ScientificCalculator.log(Math.E),0);
    }

    @Test
    public void testPowTrue() {
        assertEquals(20.25, ScientificCalculator.pow(4.5,2), 0);
    }

    @Test
    public void testPowFalse(){
        assertNotEquals(20, ScientificCalculator.pow(4.5,2),0);
    }
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue( true );
    }
}