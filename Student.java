package EncapsulationStudent;

public class Student {
	private int rollno;
	private String name;
	private int age;
	private double percentage;
	//Setter method
	public void setData(int rollno,String name,int age,double percentage )
	{
		this.rollno =rollno;
		this.name=name;
		this.age=age;
		this.percentage=percentage;
	}
	//Getter Method for rollno
	public int  getrollno()
	{
		return rollno;
	}
	//Getter Method for name 
	public String getname()
	{
		return name;
	}
	//Getter Method for age
	public int getage()
	{
		return age;
	}
	//Getter method for percentage
	public double getpercentage()
	{
		return percentage;
	}
}
