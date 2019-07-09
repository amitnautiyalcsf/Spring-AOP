package com.itc.springAop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

//Advice --> what should be called  -->Before, After etc
//Point cut--> something which define when and where. At what point you want to called it


@Component
@Aspect
@EnableAspectJAutoProxy // by default AOP is not enable.
public class Helper 
{
	@Before("execution(public void show())")
	public void log()
	{
		
		System.out.println("Show called");
		
	}
	@After("execution(public void show())")
	public void security()
	{
		System.out.println("Secured");
		
	}

}
