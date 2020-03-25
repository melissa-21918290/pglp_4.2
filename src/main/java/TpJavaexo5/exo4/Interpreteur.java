package TpJavaexo5.exo4;

import java.util.Stack;



public class Interpreteur {

    private static Stack<Command>history = new Stack(); 
    private static Command exit = new ExitCommand();
    private static Command undo = new UndoCommand();
    private static Command calcul = new CalculCommand();
    
    
	public static void exec(MoteurRPN m, String str) throws Exception {
		try {
			//exit command
			if(str.toLowerCase().equals("exit") || str.toLowerCase().equals("quit") || str.toLowerCase().equals("stop")) {
				exit.exec(m);
				System.out.println("les operands dans la pile " + MoteurRPN.getOperands().toString());
				System.out.println("les operations dans la pile " + MoteurRPN.operationHistory.toString());
			}
			else
			//undo command
			if(str.toLowerCase().equals("undo") || str.toLowerCase().equals("cancel") || str.toLowerCase().equals("back")) {
				System.out.println("les operands avant undo" + MoteurRPN.getOperands().toString());
				undo.exec(m);
				System.out.println("les operand apres undo" + MoteurRPN.getOperands().toString());
				
			}
			else {
				//apply operation or add new operand
				if ((str.length() == 1) && Operation.contains(str.charAt(0))) {
					//store operation to history
	                MoteurRPN.operationHistory.push(Operation.getOpFromValue(str.charAt(0)));
	                //execute the last added op
	                calcul.exec(m);
	                //show result
	                System.out.println("result : " + MoteurRPN.getOperands().peek());
	            } 
	            else {
	            	MoteurRPN.addOperand(Float.parseFloat(str));
	            }
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
    }
}
