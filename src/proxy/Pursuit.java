package proxy;

public class Pursuit implements IGiveGift
{
	SchoolGirl mm;
	
	public Pursuit(SchoolGirl mm)
	{
		this.mm = mm;
	}
	
	public void giveDolls()
	{
		System.out.println(mm.name +"����������");
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
