package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		
		int[] intA = {3,6,9};
		int[] intB;
		intB = intA;
		intB[0] = 20;
		intB[2] = 10;
		
		for(int i=0; i<intA.length; i++) { //i<3
			System.out.println(intA[i]); //intB[0]=20; intB[1]=6; intB[2]=10;
		}                                
		
	//	for(int i=0; i<intB.length; i++)   //intB출력용
	//		System.out.println(intB[i]);
		
	}
}
