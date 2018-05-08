package array;

public class NoOfOccurance {

	
	public static void main(String[] args) {
	
		int ar[]={23,45,23,56,20,23,56,70,81};
		int n=ar.length;
		for(int i=0;i<n;i++) {
			int count=1;
			for(int j=i+1;j<n;j++) {
				if(ar[i]==ar[j]) {
					count++;
					ar[j]=ar[n-1];
					n--;
					j--;
				}
			}
			System.out.println(ar[i]+" occurance "+count);
		}
	}
	
}
