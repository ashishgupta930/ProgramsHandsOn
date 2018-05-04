package numberpro;

import java.util.Scanner;

public class TwodigitNo {

	public static void main(String[] args) {
		
		System.out.println("Enter no");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		if(num<=-10&&num>=-99|| num>=10 && num<=99) {
			System.out.println("Number is 2 digit");
		}
		else
			System.out.println("Number is not 2 digit");
	}

}
