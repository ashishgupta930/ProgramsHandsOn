package patternprogram;

public class NumberPattern2 extends BaseClass {
	public static void main(String[] args) {
		for(int i=1;i<=n*n;i++)
		{
			if(i%n==0)
				System.out.println(n);
			else
				System.out.print(i%n);
		}
	}

}
