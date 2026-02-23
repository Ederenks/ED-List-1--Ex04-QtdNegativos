package Ex04_QtdNegativos;

public class Controller {
	public int Verificar(int []x, int i, int c  ) {
		if (i<0) {
			return c;
		}else {
			 if (x[i] < 0) {
				 return Verificar(x, i - 1, c + 1);
			 }else {
				 return Verificar(x,i-1,c);
			 }
		}
	
	}
}
