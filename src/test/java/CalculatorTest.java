import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void canAdd(){
        assertEquals(2, calculator.add(1,1), 0.01);
    }

    @Test
    public void canAddDecimal(){
        assertEquals(3000000.3333, calculator.add(1000000.1111,2000000.2222), 0.01);
    }

    @Test
    public void canSubtract(){
        assertEquals(1, calculator.subtract(2,1), 0.01);
    }


    @Test
    public void canSubtractDecimal(){
        assertEquals(3000000.3333, calculator.subtract(5000000.5555,2000000.2222), 0.01);
    }

    @Test
    public void canMultiply(){
        assertEquals(4, calculator.multiply(2,2), 0.01);
    }


}
