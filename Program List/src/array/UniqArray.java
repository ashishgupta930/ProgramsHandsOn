package array;

public class UniqArray {
	
	

	int[]uniqArray(int c[]){
		
	int ar[]={23,45,23,56,20,23,56,70,81};
	int n=c.length;
	for(int i=0;i<n;i++) {
		
		for(int j=i+1;j<n;j++) {
			if(c[i]==c[j]) {
				c[j]=c[n-1];
				n--;
				j--;
			}
		}
		
	}
	int na[]= new int [n];
	for(int i=0;i<n;i++) {
		na[i]=c[i];
	}
	return na;
}
	
}
