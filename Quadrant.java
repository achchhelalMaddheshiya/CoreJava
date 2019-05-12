import java.util.Scanner;
class Quadrant
 {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		double x,y;
		System.out.println("Enter the value of x & y");
		x=sc.nextDouble();
		y=sc.nextDouble();
		if(x>0 & y>0)
		{
			System.out.println("X and Y are in First Quadrant");
		}
		else if(x<0 & y<0)
		{
			System.out.println("X & Y are in Third	Ouadrant");
		}
		else if(x>0 & y<0)
		{
			System.out.println("X & Y are in the fourth Quadrant");
		}
		else
		{
			System.out.println("X & Y are in the second Quadrant");
		}
	}
 }