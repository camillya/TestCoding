package com.BackCodingLevel_01;

import java.util.Scanner;

//문제7) 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10) A*B=2 ,A*B=12 출력하기 A->1 B->2 ,A->3 B->4 이다.
public class Main07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A*B);
	}

}
