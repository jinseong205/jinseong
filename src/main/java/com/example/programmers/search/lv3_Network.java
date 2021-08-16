package com.example.programmers.search;

public class lv3_Network {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		lv3_Network s = new lv3_Network();
		
		int n = 3;
		int[][] computers = {{1,1,0},{1,1,0},{0,0,1}};
		System.out.println(s.solution(n,computers));
	}
	
    public int solution(int n, int[][] computers) {
        
    	int answer = 0;
        int[] network = new int[n];
        for(int i = 0; i < n; i++) {
            if(network[i] != 1) {
                dfs(computers, network, i);
                answer++;
            }
        }
        return answer;
    }
    void dfs(int[][] computers, int[] network, int start) {
    	network[start] = 1;
        for(int i = 0; i < computers.length; i++) {
            if(computers[start][i] == 1 && network[i] != 1) {
                dfs(computers, network, i);
            }
        }
    }
}
