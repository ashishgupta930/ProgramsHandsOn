package numberpro;

public class PrimeNo {

	static boolean isPrime(int no) {
		int i = 2;
		while (i <= no / 2) {
			if (no % i == 0) {
				return false;
			}
			i++;
		}
		return true;
	}

	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (isPrime(i)) {
				System.out.println(i);
				count++;
			}
		}

	}
}
