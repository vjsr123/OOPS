package Encapsulation2;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee e1= new Employee();
		e1.setData(1,"Jaga", 20000);
		System.out.println(e1.getid());
		System.out.println(e1.getname());
		System.out.println(e1.getsalary());

	}

}
