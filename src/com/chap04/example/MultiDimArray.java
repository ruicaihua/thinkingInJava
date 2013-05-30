package com.chap04.example;

import java.util.Random;

import javax.swing.JWindow;

public class MultiDimArray {
	static Random rand = new Random();
	static int pRand(int mod) {
		return Math.abs(rand.nextInt())%mod + 1;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a1 = {
				{1,2,3},
				{4,5,6}
		};
		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a1[i].length; j++) {
				System.out.println("a1[" + i + "][" + j +
						"] = " + a1[i][j]);
			}
		}
	}

}
