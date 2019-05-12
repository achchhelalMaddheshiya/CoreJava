import java.util.*;
class p15
{
	public static void main(String [] args)
	{
	Scanner sc =new Scanner(System.in);
	int x[];  //Declaration of array
	System.out.println("How many number you want in list");
	int n=sc.nextInt();
	x=new int[n];  //Intantiation of array
	int i;
	System.out.println("Enter "+n+" number in list");
	for(i=0;1<x.length;i++)
	{
		x[i]=sc.nextInt();
		
	}
	System.out.println("The number of List");
	for(int a:x)
	{
	System.out.println(a);
	}
	
	}
	
	
}