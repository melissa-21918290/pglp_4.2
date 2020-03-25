package TpJavaexo5.exo4;

public class MissingOperandException extends Exception {
	
	public MissingOperandException (){
		super("OpÃ©rande manquante pour appliquer cette opÃ©ration");
	}
}
