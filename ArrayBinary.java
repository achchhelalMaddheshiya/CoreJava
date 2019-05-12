import java.util.*;
class ArrayBinary
{
	public static void main(String [] args)
	{
		int [] x =new int[10];
		int i,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element in array");
		for(i=0;i<10;i++)
		{
			x[i]=sc.nextInt();
		}
		Arrays.sort(x);
		System.out.println("the shorted element:");
		for(int a:x)
		{
			System.out.print(+a+" ");
		}
	  System.out.println("Enter the Search element");
	  temp=sc.nextInt();
	  int pos=Arrays.binarySearch(x,temp);
	  if(pos>=0)
		  System.out.println("Found");
	  else
		  System.out.println("Not found");
	}
}