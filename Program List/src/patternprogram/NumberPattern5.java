package patternprogram;

public class NumberPattern5 extends BaseClass {

	public static void main(String[] args) {
		int k=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(k+" ");
				k++;
				if(k==10)
					k=1;
			}
		System.out.println();
		}
	}
}
