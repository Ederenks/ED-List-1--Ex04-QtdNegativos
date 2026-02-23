package Ex04_QtdNegativos;

public class Main {
	public static void main(String[]args) {
		Controller ver = new Controller();//Instância da classe Controller
		int vet [] = {0,2,-4,-5,-2,-3};
		int i = vet.length - 1; //Contador do vetor
		int c = 0;
		System.out.println(ver.Verificar(vet, i, c)); //Impressão e chamada da função.
	}

}
