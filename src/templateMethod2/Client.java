package templateMethod2;

public class Client
{
	public static void main(String[] args)
	{
		TestPaper c;
		
		System.out.println("A���Ծ�");
		c = new TestPaperA();
		c.templateMethod();
		
		
		System.out.println("\nB���Ծ�");
		c = new TestPaperB();
		c.templateMethod();
	}

}
