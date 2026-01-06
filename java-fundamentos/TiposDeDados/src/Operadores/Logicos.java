package Operadores;

public class Logicos {
	public static void main(String[] args) {

		/*
		 * Nota: Os operadores Lógicos São usados para combinar expressões booleanas.
		 * 
		 */

		// Variáveis
		int num1, num2, num3, num4;
		boolean aceite;

		// Atribuição de valores
		num1 = 10;
		num2 = 30;
		num3 = 3;
		num4 = 100;

		if ((num1 * num2) >= (num3 * num4)) {
			System.out.println("O teste passou");
		}
		if (!((num1 * num2) >= (num3 * num4) )) {
			System.out.println("O teste não passou");
		}
	}

}
