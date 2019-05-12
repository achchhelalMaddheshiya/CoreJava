//WAP to find the and surface aarea of cuboid

/*
v=l*h*b;
sa=2*(l*b=b8h=h*l);
*/

import java.util.Scanner;    //Package
class p1
{

public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);//object of scanner class
int l,b,h,v,sa;
System.out.println("Enter length,breadth and height of cuboid ");
l=sc.nextInt();
h=sc.nextInt();
b=sc.nextInt();
v=l*b*h;
sa=2*(l*b+b*h+h*l);
System.out.println("Valume of cuboid="+v);
System.out.println("Surface area of cuboid="+sa);
}
}
