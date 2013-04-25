package com.chap01.example;

import java.util.Date;
import java.util.Properties;

public class Property {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Date());
		try {
			Thread.currentThread().sleep(5*1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		Properties properties = System.getProperties();
		properties.list(System.out);
		System.out.println("----------------Memory Usage------------------");
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total Memory=" + rt.totalMemory() + " Free Memory="+ rt.freeMemory());
	}

}
