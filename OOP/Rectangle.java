class Rectangle
{

	private int length,breath;
	(int l,int b)
	{
		length=l;
		breath=b;
	}
}	
class Area extends Rectangle
{
	public int area()
	{
		return(length*breath);
	}
}
class Peri extends Rectangle
{
	public int peri()
	{
		return(2*length*breath);
	}
	
}
class TestRectanlge
{
	public static void main(String [] args)
	{
		Rectangle r=new Rectangle(12,13);
		System.out.print("Area of Rectangle : ");
		Area ar=new Area();
		ar.area();
		System.out.print(""+area());
		System.out.print("Perimeter of Rectangle : ");
		Peri pr=new Peri();
	    pr.peri();
		System.out.println(""+peri());
		
	}
}