package fundamentos;

public class AreaCircubferencia {
	public static void main(String[] args) {
		double raio = 3.4;
		// final: para tornar a variavel constante
		final double pi = 3.1459;
		double area = pi * raio * raio;
		System.out.println(area);
		
		raio = 10;
		area = pi * raio * raio;
		System.out.println("Area: " + area);
	}
}
