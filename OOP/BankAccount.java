import java.util.Scanner;
class BankAccount
{
	String NameOfDepositor;
    String TypeofAccount;
	final int AccoutNumber;
	double Amount;
	Scanner sc=new Scanner(System.in);
	BankAccount(int ac)
	{
		AccoutNumber=ac;
	}
	public void assign(double am,String toa,String nod)
	{
		NameOfDepositor=nod;
		TypeofAccount=toa;
		Amount=am;
	}
	public void deposite()
	{
		System.out.println("Enter the ammount into account deposite");
		int dop=sc.nextInt();
		Amount=(Amount+dop);
	}
	public void withdral()
	{
		System.out.println("Your current account balance "+Amount);
		System.out.println("Enter the amount into be withdral");
		int wt=sc.nextInt();
		if(Amount>0 & (Amount-wt)>0)
			Amount=Amount-wt;
		else 
			System.out.println("You are not eligible for withdral ");
	}
	public void display()
	{
		System.out.println("A/C   NameofDepositor        Amount");
		System.out.println(+AccoutNumber+"   "+NameOfDepositor+"          "+Amount);
	}
public static void main(String [] args)
{
BankAccount bk1 = new BankAccount(2164);
bk1.assign(5000.00,"Save","Achchhelal");
BankAccount bk2 = new BankAccount(2167);
bk2.assign(6000.00,"Save","Achchhelal");
BankAccount bk3 = new BankAccount(2168);
bk3.assign(5000.00,"Save","aman");
bk1.deposite();
bk2.deposite();
bk3.deposite();
bk1.withdral();
bk2.withdral();
bk3.withdral();
bk1.display();
bk2.display();
bk3.display();
}
}