package TpJavaexo5.exo4;

public class IllegalRpnOperator extends Exception {

    public IllegalRpnOperator() {
        super(" Division n'est pas parmise quand la derniere operande est nulle");
    }
}