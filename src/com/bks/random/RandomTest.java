package com.bks.random;

import java.util.Random;

public class RandomTest {
	
	public static void main(String[] args) {
		noseed();
		seed1();
		seedSameAsSeed1();
		seed2();
	}
	public static void randomTest1() {
		Random random =new Random();	//是Serializable的
		
		double a =Math.random()*1000;	//Math.random()就是Random.nextDouble()
		int b =random.nextInt(1000);
		int b2 =random.nextInt(1000);
		
		System.out.println(a+" "+b);
		System.out.println(b==b2);
	}
	public static void noseed() {
		Random random =new Random();
		
		for(int i = 0; i<4; i++) {
			System.out.println(random.nextInt(1000));
		}
		System.out.println("------------noseed------------------");
	}
	public static void seed1() {
		Random random =new Random(666L);		//种子-->long类型
		
		for(int i = 0; i<4; i++) {
			System.out.println(random.nextInt(1000));
		}
		System.out.println("------------seed1------------------");
	}
	public static void seedSameAsSeed1() {
		Random random =new Random(666L);
		
		for(int i = 0; i<4; i++) {
			System.out.println(random.nextInt(1000));
		}
		System.out.println("------------seedSameAsSeed1------------------");
	}
	public static void seed2() {
		Random random =new Random(999L);
		
		for(int i = 0; i<4; i++) {
			System.out.println(random.nextInt(1000));
		}
		System.out.println("------------seed2------------------");
	}
	
}
