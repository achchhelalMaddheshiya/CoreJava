import java.util.*;
class Recursion
{
	static int rec(int x)
	{
		if(x>1)
	      return x*rec(x-1);
	  else
		  return 1;
	}
	public static void main(String [] args)
	{
	int a,fact;
	System.out.println("Enter the no to find factorial: ");
	a= new Scanner(System.in).nextInt();
	
	fact=rec(a);
	System.out.println("The Factorial: "+fact);
	}
}