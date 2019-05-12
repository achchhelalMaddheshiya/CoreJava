//Ladder if else
//WAP to make a simple calculator
import java.util.*;
class SimpleCal 
{
	public static void main(String [] args)
	{
		int a,b;
		char op;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the operator:");
		op=sc.nextLine().charAt(0);
		System.out.print("Enter the two number :");
		a=sc.nextInt();
		b=sc.nextInt();
		
		if(op=='+')
			System.out.println("Result="+(a+b));
		else if(op=='-')
			System.out.println("Result="+(a-b));
		else if(op=='*')
			System.out.println("Result="+(a*b));
		else if(op=='/')
			System.out.println("Result="+(a/b));
		else
			System.out.println(" Invailid selection");
		
	}
	
}


