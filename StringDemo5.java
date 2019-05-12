import java.util.*;
class StringDemo5
{
	public static void main(String [] args)
	{
		int [] value=new int [10];
		int i;
		System.out.println("Enter the string");
		for(i=0;i<10;i++)
		{
			value[i]=new Scanner(System.in).nextInt();
		}
		for(int a:value)
			System.out.print(a);
	}
}
