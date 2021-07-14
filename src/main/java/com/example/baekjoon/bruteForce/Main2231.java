/**
 *  브루트포스 - 2231- 분해합
 */

package com.example.baekjoon.bruteForce;


import java.util.Scanner;

public class Main2231 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0 ;
		int temp;
		
		int N = sc.nextInt();
		for(int i = 0 ; i < N; i++) {
			temp = i;
			sum += temp;
			do {
				sum += temp%10;
				temp /= 10;
			}
			while(temp !=0);
			
			//System.out.println("  숫자" + i + "  합" + sum);

			if(sum == N) {
				System.out.println(i);
				return;
			}
			sum = 0;
		}
		
		System.out.println(0);
	}

}
	