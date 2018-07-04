package com.czxy.house.util;

public class RandomCode {
	
	public static String genCode(){
		// 199999  nums = [0,9]
		int code = (int)((Math.random()*9+1)*100000);
		return code+"";
	}
	
	public static void main(String[] args) {
		System.out.println(RandomCode.genCode());
	}
}
