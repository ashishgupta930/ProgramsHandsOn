package patternprogram;

public class SpaceStarPattern13 extends BaseClass {

	public static void main(String[] args) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==n/2||(i==j||i+j==n-1)&&j>=n/2) {
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
}