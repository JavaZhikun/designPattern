package templateMethod;

public class Client
{
	public static void main(String[] args)
	{
		System.out.println("ѧ���׳����Ծ�");
		TestPaper studentA = new TestPaperA();
		studentA.TestQuestion1();
		studentA.TestQuestion2();
		
		System.out.println("ѧ���ҳ����Ծ�");
		TestPaper studentB = new TestPaperB();
		studentB.TestQuestion1();
		studentB.TestQuestion2();
	}

}
