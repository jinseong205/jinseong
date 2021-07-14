/**
 * 기본수학1 - 1193 - 분수
 */
package com.example.baekjoon.math;

import java.util.Scanner;

public class Main1193 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		int line = 0;
		int cnt = 0;
		
		int top,bottom;

		
		while(cnt < N) {
			line++;
			cnt = line * (line+1) / 2;
		}
		
		if(line %2 != 0) {
			top = 1 + (cnt - N);
			bottom = line - (cnt - N);
		}else {
			top =  line - (cnt - N); 
			bottom = 1 + (cnt - N);
		}
		
		System.out.println(top + "/" + bottom);
		
	}


}
