package com.example.baekjoon;

import java.io.*;

public class Main1000 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String arr[] = str.split(" ");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		
		System.out.print(a+b);
	}

}
	