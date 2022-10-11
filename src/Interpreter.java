import java.lang.Math.*;

public class Interpreter {
	public static double interpret(String equation){

	}

	private static double interpretHelper(String equation){
		Boolean is_base_case = true;
		for (int i = 0;)
	}

	private static double performOp(double a, double b, String op){
		if (op.equals("+")) {
			return a + b;
		} else if (op.equals("-")) {
			return a - b;
		} else if (op.equals("*")) {
			return a * b;
		} else if (op.equals("/")) {
			return a / b;
		} else {
			return 0.0;
		}
	}
}