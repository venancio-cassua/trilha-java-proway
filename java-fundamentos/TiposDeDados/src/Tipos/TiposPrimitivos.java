package Tipos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Inteiro
		int numero;
		
		//Ponto flutuante ou decimal
		float decimalCurto;
		double decimalLongo;
		
		// Caracter
		char caracter;
		
		// Sequencia de caracter. Não é primitivo,é um Objeto
		String cadeiaCaracter;
		
		// Atribuição
		numero = 10;
		decimalCurto = 12.45f;
		decimalLongo = 22.33234;
		caracter = 'V';
		cadeiaCaracter = "Eu sou um programador... Estou a estudar "
				+ "este curso oferecido pela Capgemini em parceria "
				+ "com a Proway... Falta pouco pra começar a "
				+ "trabalhar na área.";
		
		System.out.println("numero: " + numero);
		System.out.println("Número decimal curto: " + decimalCurto);
		System.out.println("Decimal longo: " + decimalLongo);
		System.out.println("Carácter(char): " + caracter);
		System.out.println("Caracter longo(String): " + cadeiaCaracter);

	}

}
