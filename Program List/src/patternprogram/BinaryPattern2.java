package patternprogram;

public class BinaryPattern2 extends BaseClass {

	public static void main(String[] args) {
		int k = 2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(k % 2 + " ");
				k++;
			}
			System.out.println();
		}
	}
}
