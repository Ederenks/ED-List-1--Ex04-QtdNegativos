package Ex05_SomatoriaFuncao;

public class Controller {
	public double Soma(int x) {
		if (x==1) {//Quando x for = a 1, retornar 1, que seria equivalente a 1/1
			return 1; 
		}else {
			return 1.0/x + Soma(x-1);			
		}
	}
}
