import java.util.*;
class Palindrome
{
	public static void main(String [] args)
	{
		int sum=0,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int original=num;
		while(num>0)
		{
			r=num%10;
			num=num/10;
			sum=sum*10+r;
		}
		if(sum==original)
			System.out.println("Number "+original+" is Palindrome");
		else
			System.out.println("Number "+original+" is not palindrome");
	}
}