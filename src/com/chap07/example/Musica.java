package com.chap07.example;

public class Musica {
	
	public static void tune(Instrument i) {
		i.play(Note.middleC);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wind flute = new Wind();
		Stringed stringed = new Stringed();
		tune(flute);
		tune(stringed);
	}

}
class Note {
	private int value;
	private Note(int val) {
		value = val;
	}
	public static final Note 
		middleC = new Note(0),
		cSharp = new Note(1),
		cFlat = new Note(2);
}

class Instrument {
	public void play(Note n) {
		System.out.println("Instrument.play()");
	}
}

class Wind extends Instrument {
	public void play(Note n) {
		System.out.println("Wind.play()");
	}
}

class Stringed extends Instrument {
	public void play(Note n) {
		System.out.println("Stringed.play()");
	}
}
