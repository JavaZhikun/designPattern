package decoration1;

public class Client
{

	public static void main(String[] args)
	{
		Person xc = new Person("С��");
		
		System.out.println("\n ��һ��װ��");
		
		xc.WearTShirts();
		xc.WearBigTrouser();
		xc.WearSneakers();
		xc.Show();
		
		System.out.println("�ڶ���װ��");
		
		xc.WearSuit();
		xc.WearTie();
		xc.WearLeatherShoes();
		xc.Show();
		
		
	}
}
