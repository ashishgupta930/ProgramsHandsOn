package array;

public class insertArraySpecifyIndex {

	int []insertArr(int a[],int b[],int in){
		if(in<0||in>a.length) {
			System.out.println("index out of range");
			return a;
		}
		int [] na = new int [a.length+b.length];
		for(int i=0;i<a.length;i++) {
			if(i<in)
				na[i]=a[i];
			else
				na[i+b.length]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			na[in+i]=b[i];
		}
		return na;
	}
}
