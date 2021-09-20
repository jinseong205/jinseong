package com.example.programmers.heapQueue;

import java.util.PriorityQueue;

public class lv2_tooSpicy {

	public static void main(String[] args) {
		lv2_tooSpicy s = new lv2_tooSpicy();
		
		
		int[] scoville = {1,2,3,9,10,12};
		int K =7;
		
		System.out.println(s.solution(scoville, K));
	}

	public static int solution(int[] scoville, int K) {
	        int answer = 0;
	        
	        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	        for(int e : scoville) {
	        	pq.add(e);
	        }
	        
	        while(pq.peek() <= K ) {
	        	pq.add(pq.poll() + pq.poll() * 2);
	        	answer ++;
	        	
	        	if(pq.size() == 1) {
	        		break;
	        	}
	        }
	        
	        if(pq.peek() < K ) {
	        	return -1;
	        }else {
	        	return answer;
	        }
	        
	    }
}
