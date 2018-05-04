package numberpro;

import java.util.Scanner;

public class Special2digit {

public static void main(String[] args) {
	
	System.out.println("Enter no");
	Scanner sc = new Scanner(System.in);
	int no = sc.nextInt();
	int d1= no/10;
	int d2= no%10;
	int sum = (d1+d2)+(d1*d2);
	if(sum==no)
		System.out.println(+no+" is a Special no");
	else
		System.out.println(+no+ " is not a Special no");
	
}	
	
}
