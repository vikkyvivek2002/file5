interface A
{
	void display1();
}
interface B
{
	void display2();
}
class c implements A,B
{
	public void display1()
	{
		System.out.println("Interface A");
	}
	public void display2()
	{
		System.out.println("interface B");
	}
}
public class file5 {

	public static void main(String[] args) {
		
		c obj = new c();
		obj.display1();
		obj.display2();


	}

}