package com.javaex.practice; //중복체크를 없애기

public class Ex08 {
	
	public static void main (String[] args) {
	
	int[] Num = new int[6];
	
	for(int i = 0; i <Num.length; i++) {
		Num[i] = (int)(Math.random()*45)+1; //랜덤한 값을 배열에 넣는다.
	
		for(int j=0; j<i; j++) {   //중복값 비교를 위해 for문 한번 더 돌림
			if(Num[i] == Num[j]) {  //중복값 체크하는 과정
				i--;                //중복되었기 때문에 해당 칸에 들어가지 않고 다시 비교할 수 있도록 i를 감소시킴(이해아직 안됨)
			}
		}
	}
		//중복 제거된 번호 출력
		for(int i=0; i<Num.length; i++) {
			System.out.println(Num[i]+ " ");
		
		}
	}
}