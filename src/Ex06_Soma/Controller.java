package Ex06_Soma;

public class Controller {
	public int soma(int x, int z) {
		if (z ==0) {
			return x;//Quando o 2° termo, z, chegar a 0, ele teria "transferido" todo seu valor ao 1° termo, x.
		}else {
			return soma(++x, --z); //Retornar o valor do 1° termo +1 e o 2° termo -1;
		}
	}
}
