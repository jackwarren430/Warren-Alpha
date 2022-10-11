import java.lang.Math.*;
import java.util.*;

public class Interpreter {

	private static ArrayList<String> ops = new ArrayList<String>(Arrays.asList("+", "-", "*", "/"));

	public static double interpret(String equation){
		return interpretHelper(equation);
	}

	private static double interpretHelper(String equation){
		String str = "";
		String helper = "";
		int p = 0;
		for (int i = 0; i < equation.length(); i++){
			String cha = equation.substring(i, i + 1);
			if (cha.equals("(")) {
				if (p > 0) {
					helper += cha;
				}
				p++;
			} else if (cha.equals(")")) {
				p--;
				if (p == 0) {
					System.out.println("solving: " + helper + "\n");
					str += interpretHelper(helper);
					helper = "";
				} else {
					helper += cha;
				}
			} else {
				if (p > 0){
					helper += cha;
				} else {
					str += cha;
				}
			}
		}
		String a_str = "";
		String b_str = "";
		String op_str = "";
		int i = 0;
		while (!ops.contains(str.substring(i, i + 1))) {
			a_str += str.substring(i, i + 1);
			i++;		
		}
		op_str = str.substring(i, i + 1);
		i++;
		while (i < str.length()){
			b_str += str.substring(i, i + 1);
			i++;
		}
		
		return performOp(Double.parseDouble(a_str), Double.parseDouble(b_str), op_str);

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