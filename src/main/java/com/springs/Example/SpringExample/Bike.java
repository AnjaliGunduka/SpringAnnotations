package com.springs.Example.SpringExample;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
	public void drive()
	{
		System.out.println("Im driving the Bike");
	}
}
