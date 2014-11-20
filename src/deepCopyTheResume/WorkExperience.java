package deepCopyTheResume;

public class WorkExperience implements Cloneable
{
	public String workDate;
	public  String company;
	
	public String getCompany()
	{
		return company;
	}

	public void setCompany(String company)
	{
		this.company = company;
	}

	public void setWorkDate(String workDate)
	{
		this.workDate = workDate;
	}
	
	public String getWorkDate()
	{
		return workDate;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

}
