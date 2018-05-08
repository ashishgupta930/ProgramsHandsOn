package string;

import java.util.Scanner;

public class ReverseString 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  your Sentence:");
		String st = sc.nextLine();
		char ch[] = st.toCharArray();
		st="";
		for(int i=0;i<ch.length;i++) 
		{
		int k=i;
		while(i<ch.length&&ch[i]!=' ')
		{
			i++;
		}
		int j=i-1;		
		while(k<=j) 
		{
			st= st+ch[j];
			j--;
		}
		if(i<ch.length)
			st=st+ch[i];
		}
		System.out.println(st);
	}
}
