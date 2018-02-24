package com.bks.collection;

import java.util.HashMap;
import java.util.Map;

public class AboutCollection {
	
	public static void main(String[] args) {
		test1();
		test2();
	}
	
	private static void test1() {
		//泛型只能是对象，不能是int这种基本数据类型
		Map<Integer , String> m =new HashMap<Integer, String>();
		m.put(1, "str1");
		m.put(2, "str3");
		m.put(3, "str2");
		
		//这里用给了int a体现了自动拆装箱
		int a =1;
		m.put(a, "stra");
		System.out.println(m.get(a));
	}

	public static void test2(){
		String s ="1";
		String s1 =s+1;
		System.out.println(s1);
	}
}
