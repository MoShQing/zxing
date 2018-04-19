package com.mlsc.ssm.interceptor;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component("logInterceptr")
public class LogInterceptr {
	 public void before(JoinPoint point){  
		 System.out.println(point.getArgs());
	     System.out.println(point.getClass());
	     System.out.println(point.getKind());
	     System.out.println(point.getSignature());
	     System.out.println(point.getSourceLocation());
	     System.out.println(point.getStaticPart());
	     System.out.println(point.getTarget());
	     System.out.println(point.getThis());
		 
		 System.out.println("login start!");  
	    }  
	      
	    public void after(){  
	    	System.out.println("login end!");  
	    }  
}
