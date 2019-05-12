//Example for Multi-level inheritance
import java.util.*;
class Shape
{
	protected int s;  	//protected instance variable
	public void setValue(int x)
	{
		s=x;
	}
}
class Squar extends Shape
{
	public int area()
	{
		return (s*s);
	}
}
class Cube extends Shape
{
	public int valume()
	{
		return(s*s*s);
	}
}
class TestShape
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int side;
		Squar sq=new Squar();
		System.out.println("Enter the side of squar");
		side=sc.nextInt();
		sq.setValue(side);
		System.out.println("The area of square: "+sq.area());
		Cube cu=new Cube();
		System.out.println("Enter the side cube: ");
		side=sc.nextInt();
		cu.setValue(side);
		System.out.println("The valume of cube: "+cu.valume());
	}
}