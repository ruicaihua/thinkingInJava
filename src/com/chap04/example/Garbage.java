package com.chap04.example;

class Chair {
	static boolean gcrun = false;
	static boolean f = false;
	static int created = 0;
	static int finalized = 0;
	int i;
	public Chair() {
		// TODO Auto-generated constructor stub
		i = ++created;
		System.err.println("123");
		if(i == 47) {
			System.out.println("Created 47");
		}
	}
	
	protected void finalize() {
		if(!gcrun) {
			gcrun = true;
			System.out.println(
					"Beginning to finalize after " +
					created + " Chairs have been created");
		}
		if(i == 47) {
			System.out.println(
					"Finalizing Chair #47, " +
					"Setting flag to stop Chair creation");
			f = true;
		}
		finalized++;
		if(finalized >= created) {
			System.out.println("All " + finalized + " finalized");
		}
	}
}
public class Garbage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length == 0) {
			System.err.println("Usage: \n" +
					"java Garbage before\n or:\n" +
					"java Garbage after");
			return;
		}
		while(!Chair.f) {
			new Chair();
			new String("To take up space");
		}
		System.out.println(
				"After all Chairs have been created:\n" +
				"total created = " + Chair.created +
				", total finalized = " + Chair.finalized);
		if(args[0].equals("before")) {
//			System.out.println("runFinalization():");
//			System.runFinalization();
			System.out.println("gc():");
			System.gc();
			System.out.println("runFinalization():");
			System.runFinalization();
		}
		System.out.println("bye");
		if(args[0].equals("after")) {
			System.runFinalizersOnExit(true);
		}
	}

}
