package com.chap04.exercise;

public class InitialAndFinalize {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass[] arr = {new TestClass(),new TestClass()};
	}

}

class TestClass {
	public TestClass() {
		System.out.println("You just created a TestClass object!");
		
		
		
		
	}
	public TestClass(String msg) {
		System.out.println("Constructor message : " + msg);
	}
}