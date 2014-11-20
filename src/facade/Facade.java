package facade;

public class Facade
{
	SubSystemOne one;
	SubSystemTwo two;
	SubSystemThree three;
	SubSystemFour four;
	
	public Facade()
	{
		one = new SubSystemOne();
		two = new SubSystemTwo();
		three = new SubSystemThree();
		four = new SubSystemFour();
	}
	
	
	public void methodA()
	{
		System.out.println("������A��");
		one.methodOne();
		two.methodTwo();
		three.methodThree();
	}
	
	public void methodB()
	{
		System.out.println("������B��");
		two.methodTwo();
		four.methodFour();
	}
	
	

}
