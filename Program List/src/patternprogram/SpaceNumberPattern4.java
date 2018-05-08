package patternprogram;

public class SpaceNumberPattern4 extends BaseClass {

	public static void main(String[] args) {
		int sp = n / 2;
		int st = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			int k=st/2+1;
			for (int j = 1; j <= st; j++) {
				System.out.print(k);
				if(j<=st/2)
					k--;
				else 
					k++;
			}
			System.out.println();
			if (i <= n / 2) {
				sp--;
				st = st + 2;
			} else {

				sp++;
				st = st - 2;
			}
		}
	}

}
