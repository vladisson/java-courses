import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * Created by Администратор on 11.05.2017.
 */
public class CalculatorTest {
    @org.junit.Test
    public void add() throws Exception {
        Calculator calculator = new Calculator();
        calculator.add(1,2);
        Assert.assertEquals(3, calculator.getResult());
    }

}