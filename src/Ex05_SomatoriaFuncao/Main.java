package Ex05_SomatoriaFuncao;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String [ ] args) {
		Controller soma = new Controller();
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite a soma"));
		
		System.out.println(soma.Soma(x));
		System.exit(x);
	}
}
