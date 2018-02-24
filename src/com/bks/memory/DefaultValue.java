package com.bks.memory;
/**
 * 对象的默认值都是null
 * 8种基本数据类型：6种数字都是0，char是/u0000(java用unicode)，boolean是false(0就是false)
 * 
 * 另外 1byte =1b =8bit
 * 		short	2位
 * 		int		4位	范围：2的31(4*8-1)次方
 * 		long	8位
 * @author whj82
 *
 */
public class DefaultValue {

	//静态方法只能调用静态属性		a,c都是成员变量
	static int a;
	int c;
	
	public void print() {
		System.out.println(c);
	}
	
	public static void main(String[] args) {

		System.out.println(a);
		
		int b;
		//b是局部变量，在声明时必须 初始化
		//System.out.println(b);
		/////////////////////////////////////////////////////////////////////////////////
		//以下是为了验证引用传递
		String d ="d";
		System.out.println(d);
		strToNULL(d);
		System.out.println(d);
		
		Person p =new Person();
		p.setAge(11);
		p.setName("p1");
		Person p2 =new Person();
		p2.setAge(22);
		p2.setName("p2");
		
		objToNULL(p,p2);
		System.out.println(p.name);
	}
	
	public static void strToNULL(String str) {
		if(str =="") {
			str =null;
		}else {
			str="bianle";
			System.out.println(str);
		}
	}
	public static void objToNULL(Person p, Person p2) {
		p=p2;
	}
}

class Person{
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
