package string;

import java.util.Scanner;

public class ReverseString2 {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  your Sentence:");
		String st = sc.nextLine();
		char ch[] = st.toCharArray();
		st="";
		 for (int i=ch.length-1;i>=0 ;i-- ) 
		  { 
		   int k=i; 
		   while (i>=0&&ch [i]!=' ') 
		   { 
		    i--; 
		   } 
		   int j=i+1; 
		   while ( j<=k) 
		   { 
		    st =st +ch[j]; 
		    j++; 
		   } 
		   st=st+' '; 
		  } 
		  System.out.println("The reverse sentence is:"+st); 
	}

}
