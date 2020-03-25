package TpJavaexo5.exo4;

import java.util.Stack;


	

	public class MoteurRPN {
	    public static Stack<Float> operands = new Stack();
	    public static Stack<Float> operandsHistory = new Stack();
	    public static Stack<Operation> operationHistory = new Stack();
	    
	    private static boolean reading = true;
	    
	    public static boolean isReading() {
			return reading;
		}

		public static void setReadingOff() {
			reading = false;
		}

		private static final float MAX_VALUE = 9999;
	    private static final float MIN_VALUE = 595;

	    public static void addOperand(float a) throws Exception {

	        if ((a > MAX_VALUE && a >= 0) || (Math.abs(a) > MIN_VALUE && a < 0)) {
	            throw new ValueOutOfRange(": Entrez un nombre compris entre -" + MIN_VALUE + " et " + MAX_VALUE);
	        } else {
	            operands.push(a);
	        }
	    }

	    public static void applyOperation() throws Exception {
	    	try {
	    		//cas tout est OK
	        	float a = operands.pop();
	        	float b = operands.pop();
	        	operandsHistory.push(a);
	        	Operation o = operationHistory.peek();
	        	
	        	//sera fait par l'interpreteur
	            operands.push(o.eval(a, b));
	    	}
	    	catch (Exception e){
	    		System.err.println(e.getMessage());   	}
	    }
	    
	    //stack
	    //->64 2 4 1 10 9
	    //history
	    //op = + +
	    //->6 58 33 25
	    
	    private static Float inverse(float a,float b, Operation o) {
			// TODO Auto-generated method stub
			return null;
		}

		//getter
	    public static Stack getOperands() {
	        return operands;
	    }

	    //affiche les opÃ©randes restantes dans la pile
	    public static String showCurentExpression() {
	        if (operands.size() > 0) {
	            return "Expression courante :\n	"+operands.size() + " operande(s) restante(s) : " + operands.toString() + "\n";
	        }

	        return "Pile vide";
	    }
	}
