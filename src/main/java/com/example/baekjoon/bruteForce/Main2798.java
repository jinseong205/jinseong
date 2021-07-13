/**
 *  브루트포스 - 2798- 블랙잭
 */

package com.example.baekjoon.bruteForce;


import java.util.Scanner;

public class Main2798 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int M = in.nextInt();
 
		int[] arr = new int[N];
 
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		
		
		int max = -1;
		int temp = 0;
		
		for(int i = 0; i < N -2; i++) {
			for(int j = i+1; j < N -1; j++) {
				for(int k = j+1; k < N; k++) {
					temp = arr[i] + arr[j] + arr[k];
					if(temp == M) {
						System.out.println(temp);
						return;
					}
					if(temp < M && temp > max ) {
						max = temp;
					}
					temp = 0;
				}
			}
		}
		System.out.println(max);
		
	}

}
	