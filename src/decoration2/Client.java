package decoration2;

public class Client
{
	public static void main(String[] args)
	{
		Person xc = new Person("小菜");
		System.out.println("第一种装扮");
		
		Finery dtx = new TShirt();
		Finery kk = new BigTrouser();
		Finery pqx = new Sneaker();
		
		dtx.show();
		kk.show();
		pqx.show();
		xc.show();
		
		System.out.println("第二种装扮");
		Finery xz = new Suit();
		Finery ld = new Tie();
		Finery px = new LeatherShoes();
		
		xz.show();
		ld.show();
		px.show();
		xc.show();
	}

}
