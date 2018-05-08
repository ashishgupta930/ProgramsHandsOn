package array;

public class Combine {

	public static void main(String[] args) {
		
		ArrayOperation ao = new ArrayOperation();
		
		System.out.println("Read the first array element");
		int x[] = ao.readArr();
		System.out.println("Read the second array element");
		int y[]=ao.readArr();
		
		int z[]=ao.combin(x,y);
		
		System.out.println("Enter the first array element");
		ao.dispArr(x);
		
		System.out.println("Enter the second array element");
		ao.dispArr(y);
		
		System.out.println("Combined array element");
		ao.dispArr(z);
	}
}
