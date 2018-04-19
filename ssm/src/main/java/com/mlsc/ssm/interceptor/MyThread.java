package com.mlsc.ssm.interceptor;

public class MyThread implements Runnable{

	@Override
	public void run() {
		for(int i=0 ; i<1000 ; i++) {
			
			System.out.println(Thread.currentThread().getName());
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
