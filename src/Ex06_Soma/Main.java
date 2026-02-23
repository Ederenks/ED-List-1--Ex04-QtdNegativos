package Ex06_Soma;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String [] args) {
		Controller Soma = new Controller();
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° termo"));
		int z = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° termo da soma"));
		System.out.println(Soma.soma(x,z)); //Imprimir e chamar a função
	}
}
