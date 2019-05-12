interface interface2
{
	void m1();    
	void m2();    
	void m3();    
}
abstract class Test1 implements interface2
{
	public void m1()
	{
		System.out.println("Implimentation of m1");
	}
}
abstract class Test2 extends Test1 
{
	public void m2()
	{
		System.out.println("Implimentation of m2");
	}
}
class Test3 extends Test2
{
	public void m3()
	{
		System.out.println("Implimentation of m3");
	}
	public static void main(String [] args)
	{
		Test3 t=new Test3();
		t.m1();
		t.m2();
		t.m3();
	}
}