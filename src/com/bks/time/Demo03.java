package com.bks.time;

import java.text.DateFormat;
import java.util.Date;
/**
 * 关于时间的
 * @author whj82
 *
 */
public class Demo03 {

	public static void main(String[] args) {
		//
		Date date =new Date();
		System.out.println(date);
		//
		DateFormat df =DateFormat.getDateInstance();
		df.format(date);
		System.out.println(date);
	}

}
