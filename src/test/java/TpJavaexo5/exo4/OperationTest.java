package TpJavaexo5.exo4;
import static org.junit.Assert.*;
import org.hamcrest.core.IsSame;
import org.junit.Test;

import junit.framework.Assert;


public class OperationTest {

 

  
    @Test
    public void testGetPlusFromValue() {
        Assert.assertEquals(Operation.getOpFromValue('+'), Operation.PLUS);
    }

    @Test
    public void testGetMoinsFromValue() {
        Assert.assertEquals(Operation.getOpFromValue('-'), Operation.MOINS);
    }

    @Test
    public void testGetMultFromValue() {
        Assert.assertEquals(Operation.getOpFromValue('*'), Operation.MULT);
    }

    @Test
    public void testGetDivFromValue() {
        Assert.assertEquals(Operation.getOpFromValue('/'), Operation.DIV);
    }

    @Test
    public void testContainsPlus() {
        Assert.assertEquals(Operation.contains('+'), true);
    }

    @Test
    public void testContainsMoins() {
        Assert.assertEquals(Operation.contains('-'), true);
    }

    @Test
    public void testContainsMult() {
        Assert.assertEquals(Operation.contains('*'), true);
    }

    @Test
    public void testContainsDiv() {
        Assert.assertEquals(Operation.contains('/'), true);
    }

    //division par zero test
    @Test(expected = IllegalRpnOperator.class)
    public void testDivisionByZero() throws Exception {
        Operation.DIV.eval(0, 7);
    }

}