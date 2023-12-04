package com.Inheritance.Robot;

public class RobotApp {

	public static void main(String[] args)
	{
		TeacherRobot tr=new TeacherRobot();
		tr.name="Teacher Robo";
		tr.talk();
		tr.walk();
		tr.charge();
		tr.teach();
		ChefRobot cr=new ChefRobot();
		cr.name="Chef Robo";
		cr.talk();
		cr.walk();
		cr.charge();
		cr.cook();
		DoctorRobot dr=new DoctorRobot();
		dr.name="Doctor Robo";
		dr.talk();
		dr.walk();
		dr.charge();
		dr.surgery();
		
	}

}
