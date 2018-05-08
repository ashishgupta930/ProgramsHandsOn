package array;

public class nthbiggestElement {
	public static void main(String[] args) {

	}

	int nthbiggestEle(int a[], int n) {
		if (n > a.length) {
			System.out.println("out of index");

		}
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] > a[j]) {
					count++;
					if (count == n - 1) {
						return a[i];
					}
				}

			}

		}
		return -1;
	}

}
