//WAP in java find the upper and lower case for input string
import java.util.*;
class StringDemo1
{
	public static void main(String [] args)
	{
		String name;
		System.out.println("Enter your name");
		name=new Scanner(System.in).nextLine();
		System.out.println("Name in upper Case: "+name.toUpperCase());
		System.out.println("Name in Lower Case: "+name.toLowerCase());
		System.out.println("The Name length: "+name.length());
		
	}

}