package copyTheResume;

public class Client
{
	public static void main(String[] args)
	{
		Resume a = new Resume("大鸟");
		a.setPersonalInfo("男",29);
		a.setWorkExperice("1998-2000", "xx公司");
		
		Resume b = new Resume("大鸟");
		b.setPersonalInfo("男",28);
		b.setWorkExperice("1998-2000","xx公司");
		
		Resume c = new Resume("大鸟");
		c.setPersonalInfo("男",29);
		c.setWorkExperice("1998-2000", "xx公司");
		
		a.display();
		b.display();
		c.display();
		
		
	}

}
