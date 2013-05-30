package com.chap07.example;

public class Music4 {
	static void tune(Instrument4 i) {
		i.play();
		System.out.println(i.what());
		i.adjust();
	}
	static void tuneAll(Instrument4[] e) {
		for(int i=0;i<e.length;i++) {
			tune(e[i]);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instrument4[] orchestra = new Instrument4[5];
		int i = 0;
		orchestra[i++] = new Wind4();
		orchestra[i++] = new Percussion4();
		orchestra[i++] = new Stringed4();
		orchestra[i++] = new Brass4();
		orchestra[i++] = new Woodwind4();
		tuneAll(orchestra);
	}

}

abstract class Instrument4 {
	int i;
	public abstract void play();
	public String what() {
		return "Instrument4";
	}
	public abstract void adjust();
}
class Wind4 extends Instrument4 {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Wind4.play()");
	}

	public String what() {
		return "Wind4";
	}
	
	@Override
	public void adjust() {
		// TODO Auto-generated method stub
		
	}
	
}

class Percussion4 extends Instrument4 {
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Percussion4.play()");
	}

	public String what() {
		return "Percussion4";
	}
	
	@Override
	public void adjust() {
		// TODO Auto-generated method stub
		
	}
}

class Stringed4 extends Instrument4 {
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Stringed4.play()");
	}

	public String what() {
		return "Stringed4";
	}
	
	@Override
	public void adjust() {
		// TODO Auto-generated method stub
		
	}
}
class Brass4 extends Wind4 {
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Brass4.play()");
	}

	public void adjust() {
		// TODO Auto-generated method stub
		System.out.println("Brass4.adjust()");
	}
}

class Woodwind4 extends Wind4 {
	public void play() {
		System.out.println("Woodwind4.play()");
	}
	public String what() {
		return "Woodwind4";
	}
}
