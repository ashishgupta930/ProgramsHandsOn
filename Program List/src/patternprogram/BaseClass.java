package patternprogram;

import java.util.Scanner;

public class BaseClass {
	static int n;
	static {
	System.out.println("Enter n value");
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	sc.close();
	}
}

