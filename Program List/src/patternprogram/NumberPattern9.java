package patternprogram;

public class NumberPattern9 extends BaseClass {

	public static void main(String[] args) {
		int k=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(9-k%9);
				k++;
			}
		System.out.println();
		}
	}
}
