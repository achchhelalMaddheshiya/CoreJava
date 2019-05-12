class NewEmployee
{
	final int empid;
	String empname;
	double salary;
	NewEmployee(int id)    //Constructor
	{
		empid=id;
	}
	public void assign(String name,double sal)
	{
		empname=name;
		salary=sal;
	}
	public void display()
	{
		System.out.println(+empid+"  "+empname+"  "+salary);
	}
}
class Test2
	{
		public static void main(String [] args)
		{
			NewEmployee e1=new NewEmployee(1001);
			e1.assign("Achchhelal Maddheshiya",50000.00);
			e1.display();
			NewEmployee e2=new NewEmployee(1002);
			e2.assign("Achchhelal Maddheshiya",50000.00);
			e2.display();
		}
	}