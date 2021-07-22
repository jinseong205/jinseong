/**
 * if문 - 2793 - 시험성적
 */
package com.example.baekjoon.forEx;

import java.io.*;

public class Main2739 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int dan = Integer.parseInt(str);
		
			
		for(int i = 1;  i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}
		
	}

}
	