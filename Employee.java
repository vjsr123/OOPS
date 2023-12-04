package Encapsulation2;

public class Employee {
	private int id;
	private String name;
	private int salary;
	public void setData(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public int getid()
	{
		return id;
	}
	public String getname()
	{
		return name;
	}
	public int getsalary()
	{
		return salary;
	}

}
