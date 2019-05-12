//WAP to compare two string for Equality
import java.util.*;
class StringDemo2
{
	public static void main(String [] args)
	{
		String s1,s2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Ente the two array");
		System.out.println("Enter the First String");
		s1=sc.nextLine();
		System.out.println("Enter the second element");
		s2=sc.nextLine();
		if(s1.equalsIgnoreCase(s2)==true)
			System.out.println("Both Strings are equals");
		else
			System.out.println("String are not equals");
	}
}