package array;

public class SumaAndAverage {

	public static void main(String[] args) {
		int ar[]= {23+32+45+35+76};
		int sum=0;
		
		for(int i=0;i<ar.length;i++) {
			sum=sum+ar[i];
			
		}
		System.out.println(sum);
		System.out.println(ar.length);
		int avg= sum/ar.length;
		System.out.println(avg);
		getSum(ar);
	}
	static int getSum(int[]x) {
		int ar[]= {23+32+45+35+76};
		int sum =0;
		for(int i=0;i<ar.length;i++) {
			sum=sum+ar[i];
		}
		return sum;
	}
}
