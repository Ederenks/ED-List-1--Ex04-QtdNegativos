package Ex04_QtdNegativos;

public class Controller {
	public int Verificar(int []x, int i, int c  ) {
		if (i<0) {//Quando o vetor chegar no ultimo termo, retorna o valor do contador
			return c;
		}else {
			 if (x[i] < 0) {//Se o numero da posição i for negativo, acrescenta 1 no contador
				 return Verificar(x, i - 1, c + 1);
			 }else {
				 return Verificar(x,i-1,c);//caso o numero da posição i não for negativo, prossegue para proxima posiçao
			 }
		}
	
	}
}
