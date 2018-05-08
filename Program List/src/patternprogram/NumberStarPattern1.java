package patternprogram;

public class NumberStarPattern1 extends BaseClass {
	public static void main(String[] args) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
				if(j<i)
					System.out.print("*");
			}
			System.out.println();
		}
	}
	


}
