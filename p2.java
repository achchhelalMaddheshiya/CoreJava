 //WAP to find the root of quardratic equation

import java.util.*;  //package
class Quad
{
	public static void main(String[] args)
 {
	Scanner sc=new Scanner(System.in);
	double a,b,c,x1,x2,d;
	System.out.println("Enter the value of a,b and c");
	a=sc.nextDouble();
	b=sc.nextDouble();
	c=sc.nextDouble();
	d=b*b-4*a*c;
	if(d<0)
	{
		System.out.println("Roots are imaginary");
	}
	else
	{
		System.out.println("Roots are Real");
	x1=(-b+Math.sqrt(d)/2*a);	
	x2=(-b-Math.sqrt(d)/2*a);
System.out.println("Root 1="+x1);	
System.out.println("Root 2="+x2);	
	}
  }
}