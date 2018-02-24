package com.bks.datatype;

public class AboutChar {

	public static void main(String[] args) {
		test1();
	}
	/**
	 * 二进制		ascII码
	 * 48-57		0-9
	 * 65-90		A-Z
	 * 97-122		a-z
	 */
	public static void test1() {
		//asc码
		char c ='a';
		char c2 =97;
		System.out.println(c2==c);
	}
}
