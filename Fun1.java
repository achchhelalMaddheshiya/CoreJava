import java.util.*;
class Fun1
{
	
	static int add(int x,int y) // (x,y)formal parameter //Function define(Non-static)
	{
		return(x+y);
	}
	public static void main(String [] args)
	{
	int a,b;
	System.out.print("Enter the two number");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	int s=add(a,b);  //Calling the fuction(a,b) Actual parameter
	System.out.println("Sum="+s);
	
	}
  //Function define
}