package TpJavaexo5.exo4;

public class UndoCommand implements Command {

	public void exec(MoteurRPN m) {
		// TODO Auto-generated method stub
		
		float lastResult= (float) m.getOperands().pop;
		float lastSaved = m.operandsHistory.pop();
		
		//pop operation stack history
		Operation o = m.operationHistory.pop();
		
		//get inverse
		Operation io = getInverse(o);
		
		
		//restocker le resulat
		m.operands.push(io.eval(lastSaved,lastResult);
		
		//add the last saved result to operands
		m.operands.push(lastSaved);
		
	}
	

	public Operation getInverse(Operation o){
		if(o.symbole =='+') return Operation.MOINS;
		if(o.symbole =='-') return Operation.PLUS;
		if(o.symbole =='/') return Operation.MULT;
		if(o.symbole =='*') return Operation.DIV;
		return null;
		
	}
}
