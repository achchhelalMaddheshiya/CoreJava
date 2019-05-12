import java.util.*;
class MyUtil
{
	static int add(int x,int y)  //Static method
	{
		return(x+y);
	}
	public static void main(String[] args)
	{
		int a,b;
		System.out.println("Enter the two number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Sum="+add(a,b));
		System.out.println("greatest no="+new MyUtil().greatest(a,b) );
	
	}
	
	int greatest(int x,int y)  // non-static method
	{
		if(x>y)
			return x;
		else 
			return y;
	}
}