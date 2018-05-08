package patternprogram;

public class SpaceStarPattern extends BaseClass {

public static void main(String[] args) {
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");  // 5 time loop running till 4 space (n-i) times loop run
			
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
		System.out.println();
		}
	}
}
