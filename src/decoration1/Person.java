package decoration1;

public class Person
{
	private String name;
	public Person(String name)
	{
		this.name =  name;
	}
	
	public void WearTShirts()
	{
		System.out.println("��T��");
	}
	
	public void WearBigTrouser()
	{
		System.out.println("���");
	}
	
	public void WearSneakers()
	{
		System.out.println("����Ь");
	}
	
	public void WearSuit()
	{
		System.out.println("��װ");
	}
	
	public void WearTie()
	{
		System.out.println("���");
	}
	
	public void WearLeatherShoes()
	{
		System.out.println("ƤЬ");
	}
	
	public void Show()
	{
		System.out.println("װ���"+name);
	}

}
