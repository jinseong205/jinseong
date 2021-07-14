/**
 * 기본수학1 - 2869 - 달팽이는 올라가고 싶다
 */
package com.example.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2869 {

	public static void main(String[] args) throws IOException {
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String arr[] = str.split(" ");

		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int v = Integer.parseInt(arr[2]);
		
		v = v-a;
		
		double day = 1 + (double)v / (double)(a-b);	
		
		//System.out.println(day);
		System.out.println((int)Math.ceil(day));
	}


}
