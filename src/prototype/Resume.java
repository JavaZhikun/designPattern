package prototype;

public class Resume implements Cloneable
{
	private String name;
	private String sex;
	private int age;
	private String timeArea;
	private String company;
	
	
	public Resume(String name)
	{
		this.name = name;
	}
	
	//���ø�����Ϣ
	public void setPersonalInfo(String sex, int age)
	{
		this.sex = sex;
		this.age = age;
	}
	
	//���ù�������
	public void setWorkExperice(String timeArea, String company)
	{
		this.timeArea = timeArea;
		this.company = company;
	}
	
	//��ʾ
	public void display()
	{
		System.out.println("name:" + name + ", sex:" + sex + ", age:" + age);
		System.out.println("���������� timeArea:" + timeArea + ", company" +company);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		// TODO Auto-generated method stub
		return super.clone();
	}

}
