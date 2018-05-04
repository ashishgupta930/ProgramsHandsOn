package numberpro;

import java.util.Scanner;

public class SumOfEvenNoDigit {

static int sumEvenNoDigit(int n) {
			int sum =0;
			int count=0;
			do {
				count++;
				int r = n%10;
				if(count%2==0) {
					sum= sum+r;
				}
				n=n/10;
				
			}while(n!=0);
			
			return sum;
		}

		public static void main(String[] args) {
			
			System.out.println("Enter no");
			Scanner sc = new Scanner(System.in);
			int n =sc.nextInt();
			sc.close();
			System.out.println(sumEvenNoDigit(n));
		}
	}


