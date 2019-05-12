import java.util.Scanner;
import MyPack.TempConv;
class TestTempConv
{
	public static void main(String [] args)
	{
		TempConv T=new TempConv();
	    Scanner sc=new Scanner(System.in);
		double c,f;
		int ch;
		System.out.println("Enter the 1 for c to f");
		System.out.println("Enter the 2 for f to c");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
			System.out.println("Enter the temp in c: ");
			c=sc.nextDouble();
			f=T.ctof(c);
			System.out.println("The temp in f: "+f);break;
			case 2:
			System.out.println("Enter the temp in f: ");
			f=sc.nextDouble();
			c=T.ftoc(f);
			System.out.println("temp in c: "+c);break;
			default:
			System.out.println("Invailid input");
			break;
		}
	}
}