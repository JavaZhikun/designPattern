package decoration3;

public class Client
{
	public static void main(String[] args)
	{
		Person xc = new Person("С��");
		
		System.out.println("��һ��װ��");
		
		Sneaker pqx = new Sneaker();
		BigTrousers kk = new BigTrousers();
		TShirts dtx = new TShirts();
		
		pqx.Decorate(xc);
		kk.Decorate(pqx);
		dtx.Decorate(kk);
		dtx.show();
		
		
		System.out.println("�ڶ���װ��");
		
		LeatherShoes px = new LeatherShoes();
		Tie ld = new Tie();
		Suit xz = new Suit();
		
		px.Decorate(xc);
		ld.Decorate(px);
		xz.Decorate(ld);
		xz.show();
		
	}

}
