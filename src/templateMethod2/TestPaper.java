package templateMethod2;

public abstract class TestPaper
{
	public abstract String Answer1();
	public abstract String Answer2();
	
	public void templateMethod()
	{
		System.out.println("问题1：");
		System.out.println("杨过得到，后来给了郭靖，练成了倚天剑，屠龙刀的玄铁可能是："
				+ "a.球墨铸铁 b.马口铁 c.高速合金钢 d.碳素纤维");
		System.out.println("答案： " + Answer1());
		
		System.out.println("问题2：");
		System.out.println("杨过，程英，祝无双铲除了情花，造成"
				+ "a.使这种植物不在害人 b.使一种珍稀物种灭绝  c.破坏了那个生态圈的生态平衡  d.搞成该地区的沙漠化");
		System.out.println("答案：" + Answer2());
	}
	

}
