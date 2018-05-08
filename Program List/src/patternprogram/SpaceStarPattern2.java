package patternprogram;

public class SpaceStarPattern2 extends BaseClass {

public static void main(String[] args) {
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");  // first print 0 zero space first check 0<1,1<2
			
			}
			for(int j=1;j<=n-i+1;j++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
}
