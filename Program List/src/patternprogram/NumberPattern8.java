package patternprogram;

public class NumberPattern8 extends BaseClass {

	public static void main(String[] args) {
		int k=8;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(k%9+1);
				k--;
				if(k==0)
					k=9;
			}
		System.out.println();
		}
	}
}
