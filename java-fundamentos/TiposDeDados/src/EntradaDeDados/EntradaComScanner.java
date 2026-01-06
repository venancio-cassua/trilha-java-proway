package EntradaDeDados;

import java.util.Scanner;

public class EntradaComScanner {
	public static void main(String[] args) {
		
		double num1, num2, soma;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		num1 = teclado.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		num2 = teclado.nextDouble();
		
		soma = num1 + num2;
		
		System.out.println("A soma de " + num1 + " + " + num2 + " = " + soma);
		
		teclado.close();
		
	}
}
