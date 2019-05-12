//WAP to find the prime number between 1-100 
import java.util.*;
class Prime100
{
	public static void main(String [] args)
	{
		System.out.print("Prime num from 1-100 is=:");
		int i,j;
		
		for(j=1;j<=100;j++)
		{
			int c=0;
			for(i=1;i<=j;i++)
			{
				if(j%i==0)
					c=c+1;
			}
			if(c==2)
			{ System.out.print(" "+j+" "); }
			if(j==1)
			System.out.print(" "+j+" ");
		}
		
	}
}