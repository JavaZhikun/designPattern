package copyTheResume;

public class Client
{
	public static void main(String[] args)
	{
		Resume a = new Resume("����");
		a.setPersonalInfo("��",29);
		a.setWorkExperice("1998-2000", "xx��˾");
		
		Resume b = new Resume("����");
		b.setPersonalInfo("��",28);
		b.setWorkExperice("1998-2000","xx��˾");
		
		Resume c = new Resume("����");
		c.setPersonalInfo("��",29);
		c.setWorkExperice("1998-2000", "xx��˾");
		
		a.display();
		b.display();
		c.display();
		
		
	}

}
