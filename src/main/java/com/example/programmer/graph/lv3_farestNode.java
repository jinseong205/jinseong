package com.example.programmer.graph;

import java.util.*;

//fail
public class lv3_farestNode {

	public static void main(String[] args) {

		lv3_farestNode sol = new lv3_farestNode();
		
		int n = 6;
		int edge[][] = {{3,6},{4,3},{3,2},{1,3},{1,2},{2,4},{5,2}};
		sol.solution(n, edge);
	}
	public int solution(int n, int[][] edge) {
		
		int answer = 0;
		ArrayList<Integer>[] path = new ArrayList[n];
		ArrayList<Integer> bps = new ArrayList<Integer>();
		int[] dist = new int[n];

		Arrays.sort(edge);

		//for(int i = 0 ;ed)

		return answer;
	}
}
