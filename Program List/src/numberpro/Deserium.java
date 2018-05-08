package numberpro;

import java.util.Scanner;

public class Deserium {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter no");
			int n= sc.nextInt();
			boolean rs= isDeserium(n);
			if(rs) {
				System.out.println(n+" is Deserium No");
			}
			else
				System.out.println(n+" is not a Deserium no");
		}
		static boolean isDeserium(int n) {
			
			
			int dc = numberOfDigit(n);
			int sum=0,t=n;
			do {
				int r=n%10;
				sum = sum+pow(r,dc);
				dc--;
				n=n/10;
			}while(n!=0);
			return sum==t;
		}
		static int pow(int r,int dc) {
			int pw =1;
			while(dc>0) {
				pw =pw*r;
				dc--;
			}
			return pw; 
		}
		static int numberOfDigit(int n) {
			int count =0;
			do {
				count++;
				n=n/10;
			}while(n!=0);
			return count;
		}
	}


