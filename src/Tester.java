public class Tester {
	public static void main(String[] args) {
		String eq = "(5*((8/3)/6))";
		Double fin = Interpreter.interpret(eq);
		System.out.println(fin);
	}
}