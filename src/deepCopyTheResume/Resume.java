package deepCopyTheResume;

public class Resume implements Cloneable
{
	private String name;
	private String sex;
	private String age;
	private WorkExperience work;
	
	public Resume(String name)
	{
		this.name = name;
		work = new WorkExperience();
	}
	
	private Resume(WorkExperience work) throws CloneNotSupportedException
	{
		this.work = (WorkExperience)work.clone();
	}
	
	//���ø�����Ϣ
	public void setPersonalInfo(String sex, String age)
	{
		this.sex = sex;
		this.age = age;
	}
	
	//���ù�������
	public void setWorkExperience(String workDate, String company)
	{
		work.workDate = workDate;
		work.company = company;
	}

	public void display()
	{
		System.out.println("name:" + name + ", sex:" + sex +", age" + age);
		System.out.println("��������: ʱ��:" + work.workDate + ", ��˾" + work.company);
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		Resume obj = new Resume(this.work);
		obj.name = this.name;
		obj.sex = this.sex;
		obj.age = this.age;
		return obj;
	}

}
