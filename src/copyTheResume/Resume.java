package copyTheResume;

public class Resume
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
	
	public void display()
	{
		System.out.println("name:" + name + ", sex:" + sex + ", age" + age);
		System.out.println("����������\ntimeArea��" + timeArea +", company:" + company);
	}

}
