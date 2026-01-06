package Operadores;

public class Relacionais {

	public static void main(String[] args) {
		/*
		 * Nota: Relacionais São usados para comparar valores. O resultado sempre é
		 * booleano (true ou false).
		 */
		int num1, num2;

		num1 = 23;
		num2 = 23;

		if (num1 != num2) {
			System.out.println(num1 + " e " + num2 + " são diferentes");
		}

		if (num1 > num2) {
			System.out.println(num1 + " > " + num2);
		} else if (num1 < num2) {
			System.out.println(num1 + " < " + num2);
		} else {
			System.out.println(num1 + " = " + num2);
			// Nota: Poderia verificar com if a igualdade usando ==
		}
	}

}
