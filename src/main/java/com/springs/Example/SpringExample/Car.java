package com.springs.Example.SpringExample;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

	private Tyre tyre;
	private Tyre getTyre()
	{
		return tyre;
	}
	public void drive()
{
	System.out.println("Im driving the car");
}
}
