package ConstuctorChaining;

public class JavaTeacher extends Teacher {
	String className;
	public JavaTeacher()
	{
		super("KodNest");
		System.out.println("JavaTeachers 0-Para const");
		
	}
	public JavaTeacher(String className)
	{
		this();
		this.className=className;
		System.out.println("JavaTeachers 1-Para const");
	}
	void display()
	{
		System.out.println("Class Name: "+className);
		System.out.println("College Name: "+collegeName);
	}
	
}
