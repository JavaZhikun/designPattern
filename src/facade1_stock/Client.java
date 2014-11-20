package facade1_stock;

public class Client
{
	public static void main(String[] args)
	{
//		Stock1 gu1 = new Stock1();
//		Stock2 gu2 = new Stock2();
//		Stock3 gu3 = new Stock3();
//		NationalDept1 nd1 = new NationalDept1();
//		Realty1 rt1 = new Realty1();
//		
//		gu1.buy();
//		gu2.buy();
//		gu3.buy();
//		nd1.buy();
//		rt1.buy();
//		
//		
//		gu1.sell();
//		gu2.sell();
//		gu3.sell();
//		nd1.sell();
//		rt1.sell();
		
		Fund jijin = new Fund();
		//基金购买
		jijin.buyFund();
		//基金赎回
		jijin.sellFund();
		
		
	}

}
