package Ex01_Somatoria;

public class SomatoriaController {
	public int Somatoria(int x) {
		if (x<0) { //(a função deve retornar zero para n° negativos)
			return 0;
		}
		if (x< 2) { //Quando chegar em 2, retornar o 1, que seria o ultimo n° natural (antes do 0)
			return 1;
		}else {
			return x + Somatoria(x-1); //irá retornar o N° menos 1 e fazer a somatoria na volta
		}
	}
}
