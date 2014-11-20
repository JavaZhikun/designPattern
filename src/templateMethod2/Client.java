package templateMethod2;

public class Client
{
	public static void main(String[] args)
	{
		TestPaper c;
		
		System.out.println("AµÄÊÔ¾í£º");
		c = new TestPaperA();
		c.templateMethod();
		
		
		System.out.println("\nBµÄÊÔ¾í");
		c = new TestPaperB();
		c.templateMethod();
	}

}
