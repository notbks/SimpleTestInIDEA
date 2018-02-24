package com.bks.string;
/**
 * 写一个方法，实现字符串的反转，如：输入abc，输出cba
 * 
 * 用char
 * @author whj82
 *
 */
public class Fanzhuan {
	
	public static void fanzhuan(String str) {
		char[] c =str.toCharArray();
		int length =c.length;
		System.out.println(length);
		char cup;
		for(int i=0; i<((length/2)); i++) {
			System.out.println(i+"------");
			cup = c[i];
			c[i] = c[length-1-i];
			c[length-1-i] = cup; 
		}
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		String str ="012345678";
		fanzhuan(str);
		
	}

}
