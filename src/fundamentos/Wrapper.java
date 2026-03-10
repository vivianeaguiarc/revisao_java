package fundamentos;

//import java.util.Scanner;

public class Wrapper {
// versao orientada a objetos dos tipos primitivos
	/**
	 * Em Java, um Wrapper é uma classe que encapsula 
	 * (envolve) um tipo primitivo dentro de um objeto. 
	 * Isso permite tratar valores primitivos como objetos, 
	 * o que é necessário em várias APIs da linguagem, 
	 * especialmente em Collections, Generics e Frameworks.
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		//Scanner entrada = new Scanner(System.in);
		// byte
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;
		// Integer.parseInt(entrada.next());
		Long l = 1_000_000_000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l /3);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c + "...");
		
		// com ponto flutuante
		
		Float f = 123.0F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		

		//entrada.close();

	}

}
