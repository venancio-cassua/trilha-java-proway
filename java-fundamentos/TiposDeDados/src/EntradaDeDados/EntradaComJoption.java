package EntradaDeDados;

import javax.swing.JOptionPane;

public class EntradaComJoption {
	public static void main(String[] args) {
		
		int num1, num2, soma;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número"));
		
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número"));
		
		soma = num1 + num2;
		
		JOptionPane.showMessageDialog(null, "A soma dos números é: " + soma); 
		
	}
}
