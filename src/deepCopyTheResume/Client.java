package deepCopyTheResume;



public class Client
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Resume a = new Resume("����");
		a.setPersonalInfo("��", "29");
		a.setWorkExperience("1998-2000","xx��˾");
		
		Resume b = (Resume)a.clone();
		b.setWorkExperience("1998-2006", "YY��˾");
		
		Resume c = (Resume)a.clone();
		c.setPersonalInfo("��","24");
		
		a.display();
		b.display();
		c.display();
		
	}

}
