import java.util.Scanner;
class YearWeekDays
{
	public static void main(String [] args)
	{
	Scanner sc= new Scanner(System.in);
	int d,year,week,days;
	System.out.print("Enter the days for calculat:");
	d=sc.nextInt();
	year=d/365;
	week=(d-365*year)/7;
	days=(d-((365*year)+(week*7)));
	System.out.println("Number of year in "+d+" days year are: "+year);
	System.out.println("Number of year in "+d+" days week are: "+week);
	System.out.println("Number of year in "+d+" days remaining days are: "+days);
	}
	
}