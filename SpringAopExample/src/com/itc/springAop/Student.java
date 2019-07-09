package com.itc.springAop;

import org.springframework.stereotype.Component;


//Aspect Oriented Programming
//Cross cutting concern--> keep that it in a Aspect

@Component
public class Student 
{
	public void show()
	{
		
		//Log -->2 lines
		//Security --> 2-5 lines 
		//Transaction --> begin
		//10 statements  --> Business Logic
		
		System.out.println("Hello Ammy");
		
		//Log --> 2 lines
		//Transaction --> commit
		
	}

}
