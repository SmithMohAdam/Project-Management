package com.smith.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class AppLogging {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Pointcut("within(com.smith.demo.controllers..*) ")
	public void defienControllerLogger() {
		//this is logging all the controllers
	}
	
	@Before("defienControllerLogger()")
	public void logBefor(JoinPoint joinPoint) {
		logger.debug("\n\n\n-----------------------SOMETHING----------------------------\n\n\n");
		logger.debug("-------{}------{}-----with argument--{}" , joinPoint.getSignature().getDeclaringTypeName() , 
				joinPoint.getSignature().getName() , joinPoint.getArgs()
				);
	}
	@After("defienControllerLogger()")
	public void logAfter(JoinPoint joinPoint) {
		logger.debug("\n\n\n-----------------------SOMETHING----------------------------\n\n\n");
		logger.debug("-------{}------{}-----with argument--{}" , joinPoint.getSignature().getDeclaringTypeName() , 
				joinPoint.getSignature().getName() , joinPoint.getArgs()
				);
	}

}
