import java.util.Scanner;
import java.util.*;
class Example3
{
public static void main(String [] args)
   {
	   int a,b,c;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter two number : ");
	   try
	   {
	   a=sc.nextInt();
	   b=sc.nextInt();
	   c=a/b;
	   }
	   catch(InputMismatchException ex1)
	   {
		   System.out.println("Enter numbers only ");
		   c=0;
	   }
	   catch(ArithmeticException ex2)
	   {
		   System.out.println("You are try to devide by zero");
		   c=0;
	   }
	   finally
	   {
		   System.out.println("This is the finally block");
	   }
	   System.out.println("Result= "+c);
	   
   }
}