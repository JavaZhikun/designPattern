package decoration1;

public class Client
{

	public static void main(String[] args)
	{
		Person xc = new Person("小菜");
		
		System.out.println("\n 第一种装扮");
		
		xc.WearTShirts();
		xc.WearBigTrouser();
		xc.WearSneakers();
		xc.Show();
		
		System.out.println("第二种装扮");
		
		xc.WearSuit();
		xc.WearTie();
		xc.WearLeatherShoes();
		xc.Show();
		
		
	}
}
