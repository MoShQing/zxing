package com.mlsc.ssm.job;

import java.text.SimpleDateFormat;
import java.util.Date;

public class QuartzJob{

	public void runWork() throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(new Date()));
	}
	
	public static void main(String[] args) {
		
	}
}
