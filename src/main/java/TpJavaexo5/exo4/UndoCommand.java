package TpJavaexo5.exo4;

public class UndoCommand implements Command {

	public void exec(MoteurRNP m) {
		// TODO Auto-generated method stub
		
		float lastResult= (float) m.getOperands().pop;
		float lastSaved = m.operandsHistory.pop();
		
		//pop operation stack history
		Operation o = m.operationHistory.pop();
		
		//get inverse
		Operation io = getInverse(o);
		
		
		//restocker le resulat
		m.operands.push(io.eval(lastSaved,lastResult);
		
		//add the last saved result to orerands
		m.operands.push();
		
		
		
	}
	

}
