package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {

//방법 1		
/*	
		double[] Array = new double[3];

		Array[0] = 6.7;
		Array[1] = 3.3;
		Array[2] = 1.2;
*/		
//방법 2
		double[] Array = new double[] {6.7,3.3,1.2};
		
		for(int i=0; i<3; i++) {
			System.out.println(Array[i]);
		}
	}
}
