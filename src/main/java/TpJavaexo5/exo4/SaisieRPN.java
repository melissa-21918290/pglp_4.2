package TpJavaexo5.exo4;

import java.util.Scanner;



public class SaisieRPN {
	static MoteurRPN MoteurRPN = new MoteurRPN();
	static Interpreteur interpreteur = new Interpreteur();
	
    public static void startWriting() throws Exception {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        while (MoteurRPN.isReading()) {
        	Interpreteur.exec(MoteurRPN, str);
            str = sc.nextLine();
            
        }

        System.out.println(MoteurRPN.showCurentExpression() + "End. GoodBye !");
    }
}