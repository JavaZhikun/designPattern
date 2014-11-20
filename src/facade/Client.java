package facade;

public class Client
{
	public static void main(String[] args)
	{
		Facade facade = new Facade();
		
		facade.methodA();
		System.out.println();
		facade.methodB();
		
//		facade.methodA();
//		System.out.println("AA");
//		facade.methodB();
		
		
	}
}
