package TpJavaexo5.exo4;
import static org.junit.Assert.*;

import java.util.EmptyStackException;

import org.junit.Test;


public class MoteurRPNTest {

	 
	

    @Test
    public void testApplyOperation() throws Exception {

        /*MoteurRPN.applyOperation(Operation.PLUS);
        assertEquals((float) 10, (float) MoteurRPN.getOperands().lastElement(), 0);

        MoteurRPN.applyOperation(Operation.MULT);
        assertEquals((float) - 13, (float) MoteurRPN.getOperands().lastElement(), 0);

        MoteurRPN.applyOperation(Operation.MOINS);
        assertEquals((float) 21, (float) MoteurRPN.getOperands().lastElement(), 0);

        MoteurRPN.applyOperation(Operation.DIV);
        assertEquals((float) 0.33333334, (float) MoteurRPN.getOperands().lastElement(), 0);*/

    }

    @Test(expected = ValueOutOfRange.class)
    public void testMaxVal() throws Exception {
        float opr1 = 58888;
        MoteurRPN.addOperand(opr1);
    }

    @Test(expected = ValueOutOfRange.class)
    public void testMinVal() throws Exception {
        float opr1 = -58888;
        MoteurRPN.addOperand(opr1);
    }

    @Test(expected = NumberFormatException.class)
    public void EmptyString() throws Exception {
        String str = " ";
        MoteurRPN.addOperand(Float.parseFloat(str));
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testNoInsertion() throws Exception {
        String str = "";
        Operation.contains(str.charAt(0));
    }

    @Test(expected = NumberFormatException.class)
    public void testStringError() throws Exception {
        String str = "abc";
        MoteurRPN.addOperand(Float.parseFloat(str));
    }
/*
    @Test(expected = EmptyStackException.class)
    public void testEmptyStack() throws Exception {
        MoteurRPN.applyOperation(Operation.MULT);
    }*/
    
    @Test(expected = IllegalRpnOperator.class)
    public void testDivisionByZero() throws Exception {
        float opr1 = 5;
        float opr2 = 0;
        MoteurRPN.addOperand(opr1);
        MoteurRPN.addOperand(opr2);
        Operation.DIV.eval(opr2, opr1);
    }

    @Test(expected = IllegalRpnOperator.class)
    public void testNaN() throws Exception {
        float opr1 = 0;
        float opr2 = 0;
        MoteurRPN.addOperand(opr1);
        MoteurRPN.addOperand(opr2);
        Operation.DIV.eval(opr1, opr2);
    }

   
}