//nasted if-else WAP greatest num in threee num
import java.util.Scanner;
class p3
{
	public static void main (String [] args)
	{
	Scanner sc=	new Scanner(System.in);
	int a,b, c;
	System.out.println("Enter the three Numbers");
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	if(a>b)
	{
		if(a>c)
		{
			System.out.println("Greatest number="+a);
		}
		else
		{
			System.out.println("greates number="+c);
		}
	}
	else
	{
		if(b>c)
		{
			System.out.println("Greatest number="+b);
		}
		else
		{
			System.out.println("greatest number="+c);
		}
	}
	}
}