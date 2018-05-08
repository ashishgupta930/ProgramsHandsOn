package array;

public class MergeZigZag {

	public static void main(String[] args) {
ArrayOperation ao = new ArrayOperation();
		
		System.out.println("Read the first array element");
		int x[] = ao.readArr();
		System.out.println("Read the second array element");
		int y[]=ao.readArr();
		
		int z[]=zigzag(x,y);
		System.out.println("Enter the first array element");
		ao.dispArr(x);
		
		System.out.println("Enter the second array element");
		ao.dispArr(y);
		
		System.out.println("Merge Sorted zigzag array element");
		ao.dispArr(z);
	}
	static int[] zigzag(int x[],int y[]) {
		int z[]= new int [x.length+y.length];
		int i=0,j=0,k=0;
		while(i<x.length&&j<y.length) {
			z[k++]=x[i++];
		    z[k++]=y[i++];
		}
		while(i<x.length)
			z[k++]=x[i++];
		while(j<y.length)
			z[k++]=y[j++];
		return z;
	}
	
	
			
}
