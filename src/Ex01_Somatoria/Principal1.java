package Ex01_Somatoria;
import javax.swing.JOptionPane;

public class Principal1 {

	public static void main(String []args) {
		SomatoriaController som = new SomatoriaController(); //Instanciando a classe
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o n° para somatória"));
		System.out.println("A somatória de " + n + " é = " + som.Somatoria(n)); //imprime o resultado;
	}
}
