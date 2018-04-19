package com.mlsc.ssm.controller;

import org.springframework.test.context.ContextConfiguration;

/**
 * 多个文件时，可用{}

	@ContextConfiguration(locations = { "classpath*:/spring1.xml", "classpath*:/spring2.xml" })
 */
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class Test {

	public static void main(String[] args) {
		QueryController q = new QueryController();
		q.query("");
	}
}
