/**
 * 기본수학1 - 1712 - 손익분기점
 */
package com.example.baekjoon.math;

import java.util.Scanner;

public class Main1712 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if( c <= b ) {
			System.out.println(-1);
			return;
		}
		
		int answer = a / (c-b) + 1;
		System.out.println(answer);
		
	}


}
