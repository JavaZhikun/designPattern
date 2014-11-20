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
		System.out.println(mm.name +"ËÍÄãÑóÍŞÍŞ");
	}
	
	public void giveFlowers()
	{
		System.out.println(mm.name + "ËÍÄãÏÊ»¨");
	}
	
	public void giveChocolate()
	{
		System.out.println(mm.name + "ËÍÄãÇÉ¿ËÁ¦");
	}

}
