package com.javaex.practice; //1,3,7,8,33을 대입하면 답이 10.4가 아니라 10.0이다.

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		int sum = 0;
		double average = 0; //double
		int[] numA = new int[5];
		
		Scanner sc = new Scanner(System.in);

		for(int i=0; i<numA.length; i++) {
			int num = sc.nextInt();
			numA[i] = num;
			
			//총 합
			sum = sum + numA[i];
			
			//평균
			average = sum/numA.length; //5대신 'numA.length'를 넣음.
			
		}
		
		System.out.println("평균은 "+ average +"입니다.");
		
		sc.close();
	}
}
