package array;

public class Reverse {

	public static void main(String[] args) {
		ArrayOperation ao = new ArrayOperation();
		System.out.println("Enter the values");
		int x[] = ao.readArr();
		System.out.println("Before Reverse");
		ao.dispArr(x);
		System.out.println("After Reverse");
		ao.reverse(x);
		ao.dispArr(x);
	}
}
