package com.Encapsulation.laptop;

public class Laptop {
	private String processorname;
	private int memorysize;
	public Laptop(String processorname,int memorysize)
	{
		this.processorname=processorname;
		this.memorysize=memorysize;
	}
	public String getprocessorname()
	{
		return processorname;
	}
	public int getmemorysize()
	{
		return memorysize;
	}

}
