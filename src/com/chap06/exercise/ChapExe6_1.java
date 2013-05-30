package com.chap06.exercise;

public class ChapExe6_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C(new B());
	}

}

class A {

	public A() {
		System.out.println("A()");
	}
	
}

class B {

	public B() {
		System.out.println("B()");
	}
	
}

class C extends A {
	B b;
	public C(B b) {
		this.b = b;
		System.out.println("C()");
	}
}
