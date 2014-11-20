package prototype;

public class Client
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Resume a = new Resume("大鸟");
		a.setPersonalInfo("男", 29);
		a.setWorkExperice("1998-2000","xx公司");
		
		Resume b = (Resume)a.clone();
		b.setWorkExperice("1998-2006", "YY公司");
		
		Resume c = (Resume)a.clone();
		c.setPersonalInfo("男",24);
		
		a.display();
		b.display();
		c.display();
		
	}

}
