//WAP a program to check given number prime or not
import java.util.*;
class p10
{
	public static void main(String [] args)
	{
		int n,i,c=0;
		System.out.println("Enter the number");
		n=new Scanner(System.in).nextInt();
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
				c++;
		}
		if(c==2)
				System.out.println("the "+n+" is prime number");
	    
		else if(n==1)
				System.out.println("the "+n+" is prime number");
		else
				System.out.println("the "+n+" is not prime number");
	}
	
}