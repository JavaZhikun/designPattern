package templateMethod2;

public abstract class TestPaper
{
	public abstract String Answer1();
	public abstract String Answer2();
	
	public void templateMethod()
	{
		System.out.println("����1��");
		System.out.println("����õ����������˹��������������콣�������������������ǣ�"
				+ "a.��ī���� b.����� c.���ٺϽ�� d.̼����ά");
		System.out.println("�𰸣� " + Answer1());
		
		System.out.println("����2��");
		System.out.println("�������Ӣ��ף��˫�������黨�����"
				+ "a.ʹ����ֲ�ﲻ�ں��� b.ʹһ����ϡ�������  c.�ƻ����Ǹ���̬Ȧ����̬ƽ��  d.��ɸõ�����ɳĮ��");
		System.out.println("�𰸣�" + Answer2());
	}
	

}
