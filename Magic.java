import java.util.Scanner;
class Magic
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your name");
		String name=sc.nextLine();
		System.out.print("Enter your age");
		int age=sc.nextInt();
		if(age<=50)
		{
			age=age+10;
		}
		System.out.println("Hello !!"+name+"you look"+age+"year old");
			
	}
	
}