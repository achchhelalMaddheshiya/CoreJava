 //Temprature Convertor
 import java.util.Scanner;
 class TempConv
 {
	 public static void main(String [] args)
	 {
		  Scanner sc=new Scanner(System.in);
		  double c,f;
		  int ch;
		  System.out.println("Enter 1 for c to f");
		  System.out.println("Enter 2 for f to c");
		  ch=sc.nextInt();
		  switch(ch)
		  {
			  case 1:
			  System.out.print("Enter the temprature in c:");
			  c=sc.nextDouble();
			  f=((9*c)/5)+32;
			  System.out.println("The temprature in f="+f);
			  break;
			  case 2:
			  System.out.print("Enter the temprature in f:");
			  f=sc.nextDouble();
			  c=((f-32)*5)/9;
			  System.out.println("The temprature in c="+c);
			  break;
			  default:
			  System.out.println("Invailid Choise");
			  break;
			  
		  }
	 }
 }