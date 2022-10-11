public class Tester {
	public static void main(String[] args) {
		String eq = "5+(6+((118+4)+1))";
		Double fin = Interpreter.interpret(eq);
		System.out.println(fin);
	}
}