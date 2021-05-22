package com.BackCodingLevel_01;

import java.util.Scanner;

//문제9) 두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000) 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
// A->7 B->3 (10 , 4 , 21, 2, 1)
public class Main09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);

	}

}
