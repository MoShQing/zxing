package com.mlsc.ssm.interceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

public class ProxyerHandler implements InvocationHandler{

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		MyThread thread2 = new MyThread();
		
		Thread t1 = new Thread(thread1);
		t1.setName("t1");
		Thread t2 = new Thread(thread2);
		t2.setName("t2");
		t1.start();
		t2.start();
	}
	
	public static void single() {
		Date date1 = new Date();
		String s="";
		for(int i=0;i<100000 ; i++) {
			s += i;
		}
		Date date2 = new Date();
		System.out.println(date2.getTime()-date1.getTime());
	}
	
	public static void thread() {
		Date date1 = new Date();
		String s="";
		for(int i=0;i<100000 ; i++) {
			s += i;
		}
		Date date2 = new Date();
		System.out.println(date2.getTime()-date1.getTime());
	}
}
