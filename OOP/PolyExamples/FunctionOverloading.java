class Shape
{
	public int area(int s)  //area of square
	{
		return (s*s);
	}
	public int area(int l,int b)  //area of rectangale
	{
		return(l*b);
	}
	public double area(float r)  // area of circle 
	{
		return(3.14*r*r);
	}
}
class TestShape
{
	public static void main(String [] args)
	{
		Shape sp=new Shape();
		System.out.println("Area of Square= "+sp.area(10));
		System.out.println("Area of Square= "+sp.area(12,14));
		System.out.println("Area of Square= "+sp.area(5.0f));
		Scanner sc=new Scanner(System.in);
		
	}
}