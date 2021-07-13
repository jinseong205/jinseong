/**
 * 표준 입출력과 사칙 연산 - 1001 - a-b
 */
package com.example.baekjoon.stdio;

import java.io.*;

public class Main1001 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String arr[] = str.split(" ");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		
		System.out.print(a-b);
	}

}
	