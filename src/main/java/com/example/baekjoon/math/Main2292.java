/**
 * 기본수학1 - 2292 - 벌집
 */
package com.example.baekjoon.math;

import java.util.Scanner;

public class Main2292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 1;
		int sum = 1;
        
		while(true) {
        	 if(n < sum + 1) {
        		 System.out.println(answer);
        		 return;
        	 }
        	 sum = answer * 6 + sum;
        	 answer++;
        	 //System.out.println(sum);
        }
		
	}


}
