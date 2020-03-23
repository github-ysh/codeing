package com.example.demo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CustomAspect {

	@Pointcut("execution(* com.example.demo.test.Test.*(..))")
	private void aa() {
	}
	
	@After(value = "aa()&&@annotation(com.example.demo.config.CustomAnnotation)")
	public void after(JoinPoint joinPoint) {
		Object[] args = joinPoint.getArgs();
		System.out.println("after"+args);
	}
	
	@Around(value = "@annotation(com.example.demo.config.CustomAnnotation)")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable {
		Object[] args = joinPoint.getArgs();
		System.out.println("around"+args);
		joinPoint.proceed();
	}
}
