import java.util.*;
class GrossSalary
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		double basic,hra,da;
		System.out.println("Enter the basic salary");
		basic=sc.nextDouble();
		if(1<=basic & 4000 >=basic)
		{
			System.out.println("Applied the HRA 10% and DA 50%");
			hra=(10*basic)/100;
			da=(50*basic)/100;
			basic=hra+da+basic;
			System.out.println("Gross salary="+basic);
		}
		else if(4001<=basic & 8000 >= basic)
		{
			System.out.println("Applied the HRA 20% and DA 60%");
			hra=(20*basic)/100;
			da=(60*basic)/100;
			basic=hra+da+basic;
			System.out.println("Gross salary="+basic);
		}
		else if(8001<=basic & 12000 >= basic)
		{
			System.out.println("Applied the HRA 25% and DA 70%");
			hra=(30*basic)/100;
			da=(70*basic)/100;
			basic=hra+da+basic;
			System.out.println("Gross salary="+basic);
		}
		else if(1200<basic)
		{
			System.out.println("Applied the HRA 30% and DA 80%");
			hra=(30*basic)/100;
			da=(80*basic)/100;
			basic=hra+da+basic;
			System.out.println("Gross salary="+basic);
		}
		else
		{
			System.out.println("Invailid salary selection");
		}
	}
}