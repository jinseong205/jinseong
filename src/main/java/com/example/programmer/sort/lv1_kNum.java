package com.example.programmer.sort;

import java.util.*;

public class lv1_kNum {

	public static void main(String[] args) {

		lv1_kNum sol = new lv1_kNum();
		int[] arr = {1, 5, 2, 6, 3, 7, 4};
		int[][] arr2 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		System.out.println(sol.solution(arr,arr2));
	}
	
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int[] temp = null;

		for (int i = 0; i < commands.length; i++) {

			temp = new int[commands[i][1] - commands[i][0] + 1];

			temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]); 
			/*
			for(int a : temp) {
				System.out.print(a + "\t");
			}
			*/
			Arrays.sort(temp);
			System.out.println();
			answer[i] = temp[commands[i][2] - 1];
		}

		return answer;
	}
}
