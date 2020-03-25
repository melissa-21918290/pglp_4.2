package TpJavaexo5.exo4;



	public class CalculCommand implements Command {

		@Override
		public void exec(MoteurRPN m) {
			// TODO Auto-generated method stub
			try {
				m.applyOperation();
			}
			catch(Exception e) {
				System.err.println(e.getMessage());
			}
		}

	}

}
