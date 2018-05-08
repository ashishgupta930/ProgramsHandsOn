package patternprogram;

public class StarPattern8 extends BaseClass {
	public static void main(String[] args) {
		int ele = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= ele; j++) { // ele run after 1 is for 2 and 3 two time it run to print 3 star
				
				System.out.print("*");
				}
			ele = ele + 2;
			System.out.println();
		}
	}

}
