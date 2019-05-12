//wap in java to store five number in list and find the max and minimum number
import java.util.*;
class p14
{
	public static void main(String[] args)
	{
		int [] x=new int[5];
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the five number");
		for(i=0;i<5;i++)
		{
			x[i]=sc.nextInt();
		}
		Arrays.sort(x);  //this method sort the arrays of element in ascending order
		System.out.println("The element in sort order");
		for(int n:x)
		{
			System.out.println(n);
		}
		System.out.println("The Minimum Value :"+x[0]);
		System.out.println("The Maximumimum Value :"+x[x.length-1]);
		
	}
}