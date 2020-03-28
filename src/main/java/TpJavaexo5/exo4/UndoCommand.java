package TpJavaexo5.exo4;


public class UndoCommand implements Command {

	public void exec(MoteurRPN m) {
		// TODO Auto-generated method stub
		//get all history
		float lastResult = (Float) m.getOperands().pop();
		
		if (!MoteurRPN.operationHistory.isEmpty()) {
		float lastSaved  = m.operandsHistory.pop();
		
		//pop operation stack history
		Operation o = m.operationHistory.pop();
		//get inverse
		Operation io = getInverse(o);
		
		//restocker le res
		try {
			m.operands.push(io.eval(lastSaved, lastResult));
		} catch (IllegalRpnOperator e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//add the last saved res to operands
		m.operands.push(lastSaved);
	}
	}
	public Operation getInverse(Operation o) {
		if(o.symbole == '+') return Operation.MOINS;
		if(o.symbole == '-') return Operation.PLUS;
		if(o.symbole == '/') return Operation.MULT;
		if(o.symbole == '*') return Operation.DIV;
		return null;
	}

}
