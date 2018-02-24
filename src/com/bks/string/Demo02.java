package com.bks.string;

import java.util.Scanner;
/**
 * 检测输入的字符串中有多少个数字，字幕，空格和其他字符
 * 
 * 用char	48--0	65--A	97--a
 * @author whj82
 *
 */
public class Demo02 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String str =sc.nextLine();		
		sc.close();
		
		test(str);
	}
	
	public static void test(String str) {
		int c1=0;//数字
		int c2=0;//英文字母
		int c3=0;//空格
		int c4=0;//其他字符
		char[] c= str.toCharArray();
		
		for(char ex:c) {
			if(ex>=48 && ex<58) {
				c1++;
			}else if((ex>=65 && ex<91) ||(ex>=97 && ex<123)) {
				c2++;
			}else if(ex==32) {
				c3++;
			}else {
				c4++;
			}
		}
		System.out.println(c1+"  "+c2+"  "+c3+"  "+c4+"  ");
	}

}
