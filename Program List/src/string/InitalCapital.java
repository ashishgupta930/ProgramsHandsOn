package string;

import java.util.Scanner;

public class InitalCapital {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Sentence");
		String st = sc.nextLine();
		System.out.println("Before Convert");
		System.out.println(st);
		st = initCap(st);
		System.out.println("after convert");
		System.out.println(st);
	}

	static String initCap(String st)
	{

		char ch[] = st.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ') 
			{
				if (ch[i] >= 'a' && ch[i] <= 'z') 
				{
					ch[i] = (char) (ch[i] - 32);
				}
			} else if (ch[i] >= 65 && ch[i] <= 90) 
			{
				ch[i] = (char) (ch[i] + 32);
			}
		}
		return new String(ch);
	}
}
