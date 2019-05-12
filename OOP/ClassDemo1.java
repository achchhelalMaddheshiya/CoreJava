class Employee
{
	int empid;
	String empname;
	double salary;
	public void assign(int id,String name,double sal)
	{
		empid=id;
		empname=name;
		salary=sal;
	}
	public void display()
	{
		System.out.println(+empid+" "+empname+" "+salary);
	}

}
class Test1
{
	public static void main(String [] args)
	{
		Employee e1=new Employee();  //Creation of object
		e1.assign(1001,"AchchhelalMaddheshiya",50000.00);   //
		e1.display();
		Employee e2=new Employee();  //Creation of object
		e2.assign(1002,"kanchan",60000.00);
		e2.display();
	}
}






















