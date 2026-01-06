package LacosDeRepeticao;

public class LacoDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int qtdVezes = 1;

		do {
			System.out.println("Contando a " + qtdVezes + " vez");
			qtdVezes++;
		} while (qtdVezes <= 10);

		System.out.println("Foi contado " + (qtdVezes -1) + " vezes");
	}

}
