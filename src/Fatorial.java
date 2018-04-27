
public class Fatorial {
	//Versão iterativa do cálculo fatorial
	/*
	public static void main (String args[]) {
		for(long i=0; i<=5;i++) {
			System.out.println(i + "! = " + fatorial(i));
		}
	}*/
	public static long fatorial(long num) {
		if (num <=1 )  return 1;
		else  return num * fatorial(num - 1);
	}
	//versão iterativa do calculo fatorial, incluindo o teste n-0 
	public int calcularFatorial(int n) throws IllegalArgumentException {
		if (n < 0)
			throw new IllegalArgumentException("nao existe fatorial apra numeros negativos");
		int resultado = 1;
		if(n != 0 ){
			for (int i = 2; i <= n; i++) 
				resultado*=i;
		}
		return resultado;
	}

}
