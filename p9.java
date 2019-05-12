//WAP in java to generate the fibonacci Sequence upto n terms
// 0  1  2 3 5 8 13 ........
import java.util.*;
class p9
{
	public static void main(String [] args)
	{
		int a=0,b=1,n,i,c;
		System.out.println("enter the nubmer upto fibonacci generat");
		n=new Scanner(System.in).nextInt();
		System.out.print(+a+" "+b+" ");
		for(i=2;i<=n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(+c+" ");
		}
		
		
	}
}