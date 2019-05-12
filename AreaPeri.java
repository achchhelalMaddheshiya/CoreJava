import java.util.*;
class AreaPeri
{
	double peri(double x)
	    {
		return(2*3.14*x);
	    }
	static double area(double x)
		{
			return (3.14*x*x);
		}	
	public static void main (String [] args)
	{
		System.out.println("Enter the Radius of circle");
		int a=new Scanner(System.in).nextInt();
		double area=area(a);
		System.out.println("Area of circle: "+area);
		double peri=new AreaPeri().peri(a);
		System.out.println("Perimeter of circle: "+peri);
	}
		
}