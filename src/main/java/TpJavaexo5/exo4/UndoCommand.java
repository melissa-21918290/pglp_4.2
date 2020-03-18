package TpJavaexo5.exo4;

import command.Command;
import rpn.MoteurRPN;
import rpn.Operation;

public class UndoCommand implements Command {

	@Override
	public void exec(MoteurRPN m) {
		// TODO Auto-generated method stub
		//get all history
		float lastResult = (float) m.getOperands().pop();
		float lastSaved  = m.operandsHistory.pop();
		
		//pop operation stack history
		Operation o = m.operationHistory.pop();
		//get inverse
		Operation io = getInverse(o);
		
		//restocker le res
		m.operands.push(io.eval(lastSaved, lastResult));
		//add the last saved res to operands
		m.operands.push(lastSaved);
	}
	
	public Operation getInverse(Operation o) {
		if(o.symbole == '+') return Operation.MOINS;
		if(o.symbole == '-') return Operation.PLUS;
		if(o.symbole == '/') return Operation.MULT;
		if(o.symbole == '*') return Operation.DIV;
		return null;
	}

}
