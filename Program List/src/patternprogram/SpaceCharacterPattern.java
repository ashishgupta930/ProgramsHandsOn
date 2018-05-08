package patternprogram;

public class SpaceCharacterPattern extends BaseClass {

	public static void main(String[] args) {
		int sp = n / 2;
		int ch = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= ch; j++) {
				System.out.print((char)(64+j));
			}
			System.out.println();
			if (i <= n / 2) {
				sp--;
				ch = ch + 2;
			} else {

				sp++;
				ch = ch - 2;
			}
		}
	}

}
