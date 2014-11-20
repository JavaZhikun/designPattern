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
	
	//设置个人信息
	public void setPersonalInfo(String sex, int age)
	{
		this.sex = sex;
		this.age = age;
	}
	
	//设置工作经历
	public void setWorkExperice(String timeArea, String company)
	{
		this.timeArea = timeArea;
		this.company = company;
	}
	
	public void display()
	{
		System.out.println("name:" + name + ", sex:" + sex + ", age" + age);
		System.out.println("工作经历：\ntimeArea：" + timeArea +", company:" + company);
	}

}
