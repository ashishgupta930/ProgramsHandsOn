package numberpro;

public class FactorialNo {

		static  long isFactorial(long n) {
			
			int fact =1;
			for(int i=1;i<=n;i++) {
				fact = fact*i;
			}
			return fact;
	}
		

	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
			
		System.out.println(i+" !="+isFactorial(i));
			}
		}

	}

