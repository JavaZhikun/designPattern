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
	
	//显示
	public void display()
	{
		System.out.println("name:" + name + ", sex:" + sex + ", age:" + age);
		System.out.println("工作经历： timeArea:" + timeArea + ", company" +company);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		// TODO Auto-generated method stub
		return super.clone();
	}

}
