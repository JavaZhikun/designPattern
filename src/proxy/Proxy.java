package proxy;

public class Proxy
{
	Pursuit gg;
	SchoolGirl mm;
	
	public Proxy(SchoolGirl mm)
	{
		gg = new Pursuit(mm);
	}
	
	public void giveDolls()
	{
		System.out.println(mm.name + "����������");
	}

	public void giveFlowers()
	{
		System.out.println(mm.name + "�����ʻ�");
	}
	
	public void giveChocolate()
	{
		System.out.println(mm.name + "�����ɿ���");
	}
}
