package string;

import java.util.Scanner;

public class CountNumberOfWords
{
	

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  your Sentence:");
		String st= sc.nextLine();
		int wc= numberOfwords(st);
		System.out.println("number of Words:"+wc);
	}

	private static int numberOfwords(String st) 
	{

		int count =0;
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ' ) 
			{
				
			}
		}
		return 0;
	}
}
