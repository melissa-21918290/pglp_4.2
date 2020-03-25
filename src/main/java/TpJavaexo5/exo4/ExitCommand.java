package TpJavaexo5.exo4;



public class ExitCommand implements Command {

	@Override
	public void exec(MoteurRPN m) {
		// TODO Auto-generated method stub
		m.setReadingOff();
	}

}
