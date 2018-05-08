package string;

import java.util.Scanner;

public class CountCharacter
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string"); 
		  String s=sc.nextLine();
		  char ch[] = s.toCharArray();
		 
		  for(int i=0;i<ch.length;i++)  
		  {
			  s="";
			  while(i<ch.length&&ch[i]!=' ') 
			  {
				  s= s+ch[i];
				  i++;
				  
			  }
			  if(s.length()>0) 
			  {
				  System.out.println(s+"---->"+s.length());
			  }
			
			  
		  }
		
	}
}
