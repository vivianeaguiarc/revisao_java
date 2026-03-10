package fundamentos;

import java.util.Scanner;

public class Console {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia!\n");
		
		System.out.println("Boa");
		System.out.println("tarde!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d", 1,2,3,4,5,6);
		System.out.printf("Salario: %.1f\n", 1234.5678);
		System.out.printf("Nome: %s%n", "Viviane");
		
		Scanner sc = new Scanner(System.in); // aponta para o teclado
		System.out.print("Digite o seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite o seu sobrenome: ");
		String sobrenome = sc.nextLine();
		System.out.println("\nNome = " + nome + " " + sobrenome);
		
		System.out.println("Digite a sua idade: ");
		int idade = sc.nextInt();
		
		System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);
		
		sc.close();
		

	}

}
