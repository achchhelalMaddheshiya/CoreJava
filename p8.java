 // WAP to fine the sum of the digit of given number
 import java.util.Scanner;
 class p8
 {
	 public static void main(String [] args)
	 {
		 System.out.println("Enter the number");
		 int n =new Scanner(System.in).nextInt();
		 int r,sum=0;
		 while(n>0)
		 {
			 r=n%10;
			 sum=sum+r;
			 n=n/10;
		 }
		 System.out.println("The sum of digit is ="+sum);
	 }
 }