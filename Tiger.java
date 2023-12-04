package com.Inherit.Program1;

public class Tiger extends Animal {
	String TigerSound="TigerRoar";
	void makesound()
	{
		System.out.println("Tiger is making "+TigerSound);
	}
	void accessparentmethod()
	{
		super.makesound();
	}

}
