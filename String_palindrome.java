import java.util.*;

public class String_palindrome {

	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		String reverse="";
		int length = name.length();
		System.out.println("in loop");
		for (int i=0; i<length;i++)
		{
          System.out.println (name.charAt(i));
			
		}
		
		for (int j=length-1;j>=0;j--)
		{
			reverse=reverse + name.charAt(j);
		}
		System.out.println(reverse);

	
	if(name.equals(reverse))
	{
		System.out.println("pallindrome");
	}
	else
		System.out.println("not palindrome");
	}
 
}
