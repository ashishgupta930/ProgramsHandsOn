package array;

import java.util.Scanner;

public class ArrayOperation {
	
	int[] readArr() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many values you have");
		int n = sc.nextInt();
		
		int ar[] = new int[n];
		System.out.println("Enter"+" " + n + " Integer value");
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		return ar;
	}

	void dispArr(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i] + " ");
		}
		System.out.println();
	}

	int [] combin(int a[],int b[]) {
		int c[]=new int [a.length+b.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
			}
		for(int i=0;i<b.length;i++) {
			c[a.length+i]=b[i];
		}
		return c;
	}

	void reverse(int x[]) {
		for (int i = 0; i < x.length / 2; i++) {
			int t = x[i];
			x[i] = x[x.length - 1 - i];
			x[x.length - 1 - i] = t;
		}
	}

	void exchange(int ar[]) {
		for (int i = 0; i < ar.length - 1; i = i + 2) {
			int t = ar[i];
			ar[i] = ar[i + 1];
			ar[i + 1] = t;
		}
	}

	int[] insertArr(int a[], int in, int ele) {//in = index
		if (in < 0 || in > a.length) {
			System.out.println("index not in the range");
			return a;
		}
		int na[] = new int[a.length + 1];  // new array
		for (int i = 0; i < a.length; i++) {
			if (i < in)
				na[i] = a[i];
			else
				na[i + 1] = a[i];
		}
		na[in] = ele;
		return na;
	}

	int[] deleteArr(int a[], int in) {
		if (in < 0 || in >= a.length) {
			System.out.println("index not in the range");
			return a;
		}
		int na[] = new int[a.length - 1];
		for (int i = 0; i < na.length; i++) {
			if (i < in)
				na[i] = a[i];
			else
				na[i] = a[i + 1];
		}
		return na;
	}

	
}
