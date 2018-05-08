package patternprogram;

public class NumberPattern7 extends BaseClass {

	public static void main(String[] args) {
		int k=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print((char)(65+k%26));
				k++;
			}
		System.out.println();
		}
	}
}
