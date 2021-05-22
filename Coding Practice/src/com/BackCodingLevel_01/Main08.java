package com.BackCodingLevel_01;

import java.util.Scanner;

//문제8) 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10) 첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.
//	A/B = 0.33333333333333333333333333333333 A->1 B->3 , A/B = 0.8  A->4 B->5 
public class Main08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextInt();
		double B = sc.nextInt();
		
		System.out.println(A/B);
	}

}
