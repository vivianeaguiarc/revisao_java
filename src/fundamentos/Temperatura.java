package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (ºF - 32) x 5/9 = ºC
		final double fator = 5.0 / 9.0;
		final double ajuste = 32;
		
		double fahrenheit = 86;
		double celsius = (fahrenheit - ajuste) * fator;
		
		fahrenheit = 92;
		celsius = (fahrenheit - ajuste) * fator;
		
		System.out.println("O resultado é " + celsius + "ºC.");
	}
}
