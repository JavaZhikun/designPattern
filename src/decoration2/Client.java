package decoration2;

public class Client
{
	public static void main(String[] args)
	{
		Person xc = new Person("С��");
		System.out.println("��һ��װ��");
		
		Finery dtx = new TShirt();
		Finery kk = new BigTrouser();
		Finery pqx = new Sneaker();
		
		dtx.show();
		kk.show();
		pqx.show();
		xc.show();
		
		System.out.println("�ڶ���װ��");
		Finery xz = new Suit();
		Finery ld = new Tie();
		Finery px = new LeatherShoes();
		
		xz.show();
		ld.show();
		px.show();
		xc.show();
	}

}
