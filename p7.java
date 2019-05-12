//WAP to print the of given number 
import  java.util.Scanner;
class p7
{
	public static void main(String [] args)
	{
	int n,i;
	System.out.println("Enter the number to print the table");
	n=new Scanner(System.in).nextInt();
	i=1; // initialization counter
	while(i<=10)
	{
		System.out.println(n+"*"+i+"="+(n*i));
		i++;  // updation
	}
	}
}