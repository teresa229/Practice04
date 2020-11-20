package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

/*		
		int[] wonArray = new int[10];
		wonArray[0] = 50000;
		wonArray[1] = 10000;
		wonArray[2] = 5000;
		wonArray[3] = 1000;
		wonArray[4] = 500;
		wonArray[5] = 100;
		wonArray[6] = 50;
		wonArray[7] = 10;
		wonArray[8] = 5;
		wonArray[9] = 1;
*/
		
		int[] wonArray = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		int count = 0; //개수 카운트
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액: ");
		int price = sc.nextInt();
		
		for(int i=0; i<10; i++) {
			count = price/wonArray[i];
			System.out.println(wonArray[i]+"원: "+count+"개");
			price = price-(wonArray[i]*count);
		}
		
		sc.close();
	}
}
