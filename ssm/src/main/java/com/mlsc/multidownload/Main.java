package com.mlsc.multidownload;

import java.math.BigDecimal;

public class Main {
	public static void main(String[] argv) {
//		Processor stringProcessor = (final String str) -> str.length();
//		String name = "Java Lambda";
//		int length = stringProcessor.getStringLength(name);
//		System.out.println(length);

//		Integer a1 = 127;
//		Integer a2 = 127;
//		System.out.println(a1==a2);
//		
//		int[][] array = {{1,2,3},{4,5,6}};
//		System.out.println(array[array.length-1][array[array.length-1].length-1]);
		
//		System.out.println(Find(16,new int[][]{}));
//		System.out.println(10%3*2);
//		BigDecimal b = new BigDecimal(11);
//		BigDecimal c = new BigDecimal(12);
//		System.out.println(b.multiply(c));
		
		Integer a1 = 128;
	    Integer a2 = 128;
	    System.out.println(10d/3);
		
	}
	
	 public static boolean Find(int target, int [][] array) {
	        if(array != null && array.length>0 && array[0].length>0) {
	            if(target<array[0][0] || target>array[array.length-1][array[array.length-1].length-1]) {
	                return false;
	            }
	            
	            for(int i=0;i<array.length;i++) {
	                if(array[i] != null && array[i].length>0) {
	                    for(int j=0;j<array[i].length;j++) {
	                        if(array[i][j]==target) {
	                            return true;
	                        }
	                    }
	                }
	            }
	            return false;
	        }else {
	            return false;
	        }
	        
	    }
	 
	 public static String replaceSpace(StringBuffer str) {
		 if(str != null && str.length()>0) {
	            String string = str.toString();
	            return string.replace(" ", "%20");
	        }
	        return str.toString();
	    }
}

@FunctionalInterface
interface Processor {
	int getStringLength(String str);
}


