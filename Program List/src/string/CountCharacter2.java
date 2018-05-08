package string;

import java.util.Scanner;

public class CountCharacter2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string"); 
		  String s=sc.nextLine();
		  char ch[] = s.toCharArray();
		  String nst=""; 
		  int nc=0; 
		  for (int i=0; i<s.length();i++ ) 
		  { 
		   if (s.charAt(i)==' ') 
		   { 
		    nst=nst + nc; 
		    nc=0; 
		   } 
		   else 
		   { 
		    nc++; 
		    nst=nst + s.charAt(i); 
		   } 
		  } 
		  nst=nst + nc; 
		
		  System.out.println ("No of character in each word in a string is "+nst); 	
		
	}
}
