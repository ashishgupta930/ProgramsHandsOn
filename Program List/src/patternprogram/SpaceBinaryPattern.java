package patternprogram;

public class SpaceBinaryPattern extends BaseClass {
	
	public static void main(String[] args) {
		int sp = n / 2;
		int st = 1;
		int k=1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			
			
			for (int j = 1; j <= st; j++) {
				if(k==1||k==n) {
					System.out.print(1);
				}
				else
				System.out.print(k%2);
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
