package proxy;

public class Client
{
	//daili是代理，李娇娇是被追求者，zhoujiayi是追求者
	public static void main(String[] args)
	{
		SchoolGirl jiaojiao = new SchoolGirl();
		jiaojiao.name = "李娇娇";
		
//		Pursuit zhoujiayi = new Pursuit(jiaojiao);
		Proxy daili = new Proxy(jiaojiao);
		
		daili.giveDolls();
		daili.giveFlowers();
		daili.giveChocolate();
		
		
		
	}

}
