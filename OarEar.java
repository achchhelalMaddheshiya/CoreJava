import java.util.*;
class OarEar
{
	public static void main(String [] args)
	{
		int [] A=new int[10];
		int [] O=new int[10];
		int [] E=new int[10];
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 10numbers in array");
		for(i=0;i<10;i++)
		{
			A[i]=sc.nextInt();
		}
		for(i=0;i<10;i++)
		{
			if(A[i]%2==0)
			{
				E[i]=A[i];
			}
			else
			{
				O[i]=A[i];
			}
		}
		System.out.println("Main Array: ");
		for(int a:A)
			System.out.print(+a+" ");
		System.out.print("\n");
		System.out.println("Even Array: ");
		for(int e:E)
			System.out.print(+e+" ");
		System.out.print("\n");
		]
		System.out.println("odd Array: ");
		for(int o:O)
			System.out.print(+o+" ");
	}
}