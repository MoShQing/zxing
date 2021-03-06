package com.mlsc.ssm.controller;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;

import redis.clients.jedis.Jedis;

public class JedisDemo {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("127.0.0.1");
		System.out.println("connection success");
		System.out.println("server is running"+jedis.ping());
		System.out.println(jedis.get("a"));
		jedis.set("a", "999");
		System.out.println(jedis.get("a"));
		
		Set<String> set = jedis.keys("*");
		Iterator it = set.iterator();
//		while(it.hasNext()) {
//			String key = (String)it.next();
//			System.out.println(key+"--"+jedis.get(key));
//		}
		
		System.out.println(jedis.lrange("c", 0, -1));
		jedis.lrange("c", 0, -1).sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.compareTo(o2)<0) {
					return 1;
				}
				return 0;
			}
		});
		
		System.out.println(jedis.lrange("c", 0, -1));
	}
}
