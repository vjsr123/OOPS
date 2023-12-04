package EncapsulationStudent;

public class StudentApp {

	public static void main(String[] args)
	{
		
		Student s1 = new Student();
		Student s2= new Student();
		//calling setData Method
		s1.setData(1,"jagadeesh", 23, 88.8);
		//calling setData Method
		s2.setData(2, "raja", 26, 96.5);
		//calling getrollno method of s1 object
		System.out.println(s1.getrollno());
		//calling getname method of s2 object
		System.out.println(s1.getname());
		//calling getage  method of object s1
		System.out.println(s1.getage());
		//calling getpercentage method of object s1
		System.out.println(s1.getpercentage());
		//calling getrollnoethod of object s2
		System.out.println(s2.getrollno());
		//calling getname method of object s2
		System.out.println(s2.getname());
		//calling getage method of object s2
		System.out.println(s2.getage());
		//calling getpercentage of method of object s2
		System.out.println(s2.getpercentage());

	}

}
