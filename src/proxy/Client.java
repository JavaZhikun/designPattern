package proxy;

public class Client
{
	//daili�Ǵ�������Ǳ�׷���ߣ�zhoujiayi��׷����
	public static void main(String[] args)
	{
		SchoolGirl jiaojiao = new SchoolGirl();
		jiaojiao.name = "���";
		
//		Pursuit zhoujiayi = new Pursuit(jiaojiao);
		Proxy daili = new Proxy(jiaojiao);
		
		daili.giveDolls();
		daili.giveFlowers();
		daili.giveChocolate();
		
		
		
	}

}
