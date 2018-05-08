package patternprogram;

public class StarPattern3 extends BaseClass {

	public static void main(String[] args) {
		for (int i = 1; i <= n * n; i++) {
			System.out.print("*");
			if (i % n == 0)
				System.out.println();

		}

	}
}
