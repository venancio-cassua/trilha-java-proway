package Tipos;

public class OperadoresAritmeticos {
	public static void main(String[] args) {
		// Declaração de variáveis
		int num1, num2, soma, subtracao, multiplicacao, divisao;
		
		// Atribuição
		num1 = 10;
		num2 = 20;
		soma = num1 + num2;
		subtracao = num1 - num2;
		multiplicacao = num1 * num2;
		divisao = num1 /num2;
				
		
		System.out.println("Soma é: " + soma);
		System.out.println("Subtracao é: " + subtracao);
		System.out.println("Multiplicacao é: " + multiplicacao);
		System.out.println("O resultado da divisão é: " + divisao);
		System.out.println();
		
		// Incrementar uma unidade nas variáveis soma, subtração, multiplicação, divisão
		System.out.println("Valores depois do incremento");
		System.out.println("Soma é: " + soma++);
		System.out.println("Subtracao é: " + subtracao++);
		System.out.println("Multiplicacao é: " + multiplicacao++);
		System.out.println("Divisão é: " + divisao++);
		
		
		// Decrementar duas unidades nas variáveis soma, subtração, multiplicação, divisão
		System.out.println("Valores depois do decremento");
		System.out.println("Soma é: " + (soma - 2));
		System.out.println("Subtracao é: " + (subtracao - 2) );
		System.out.println("Multiplicacao é: " + (multiplicacao - 2) );
		System.out.println("Divisão é: " + (divisao - 2) );
	}

}
