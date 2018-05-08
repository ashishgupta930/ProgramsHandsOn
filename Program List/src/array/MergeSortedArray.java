package array;

public class MergeSortedArray {

	public static void main(String[] args) {
ArrayOperation ao = new ArrayOperation();
		
		System.out.println("Read the first array element");
		int x[] = ao.readArr();
		System.out.println("Read the second array element");
		int y[]=ao.readArr();
		
		int z[]=mergeSort(x,y);
		System.out.println("Enter the first array element");
		ao.dispArr(x);
		
		System.out.println("Enter the second array element");
		ao.dispArr(y);
		
		System.out.println("Merge Sorted array element");
		ao.dispArr(z);
	}
	static int[]mergeSort(int x[],int y[]){
		int z[]=new int[x.length+y.length];
		int i=0,j=0,k=0;
		while(i<x.length&&j<y.length) {
			if(x[i]<y[j])
				z[k++]=x[i++];
			else
				z[k++]=y[j++];
			
		}
		while (i<x.length)
			z[k++]=x[i++];
		while(j<y.length)
			z[k++]=y[j++];
		return z;
	}
	
}
