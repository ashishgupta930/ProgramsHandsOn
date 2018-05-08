package patternprogram;

public class SpaceNumberPattern5 extends BaseClass {
	public static void main(String[] args) {
		int sp = n / 2;
		int num = 1;
		int k=1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=num; j++) {
				if(k==10)
					k=1;
				System.out.print(k);
				
				k++;
			}
			System.out.println();
			if (i <= n / 2) {
				sp--;
				num = num + 2;
			} else {

				sp++;
				num = num - 2;
				
			}
		}
	}}
