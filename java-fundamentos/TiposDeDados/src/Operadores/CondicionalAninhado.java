package Operadores;

public class CondicionalAninhado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2, num3, maior, menor;

		// Atruição de valores as variáveis

		num1 = 30;
		num2 = 50;
		num3 = 50;
		maior = 0;
		menor = 0;

		// Condicionais
		if (num1 == num2 && num2 == num3) {
			System.out.println("Os números são iguais");
		} else {
			if ((num1 > num2) && (num1 > num3)) {
				maior = num1;
				if (num2 > num3) {
					menor = num3;
				} else {
					menor = num2;
				}
			} else if ((num1 < num2) && (num2 > num3)) {
				maior = num2;
				if (num3 > num1) {
					menor = num1;
				} else {
					menor = num3;
				}
			}

			else {
				maior = num3;
				if (num2 > num1) {
					menor = num1;
				} else {
					menor = num2;
				}
			}

			System.out.println("Maior número: " + maior);
			System.out.println("Menor número: " + menor);
		}

	}

}
