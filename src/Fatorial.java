
public class Fatorial {
	
	public static void main (String args[]) {
		for(long i=0; i<=5;i++) {
			System.out.println(i + "! = " + fatorial(i));
		}
	}
	public static long fatorial(long num) {
		if (num <=1 )  return 1;
		else  return num * fatorial(num - 1);
	}

}
