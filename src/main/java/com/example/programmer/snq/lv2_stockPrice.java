package com.example.programmer.snq;

class lv2_stockPrice {
	public static void main(String[] args) {

		lv2_stockPrice s = new lv2_stockPrice();
		int[] arr = {4, 3, 1, 1, 0};
		int[] answer=  s.solution(arr);
		
		for(int n : arr) {
			System.out.print(n + "\t");
		}
	}

	public int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		int time = 0;

		for (int i = 0; i < prices.length; i++) {
			for (int j = i + 1; j < prices.length; j++) {

				time++;
				if (prices[i] > prices[j]) {
					break;
				}
			}
			answer[i] = time;
			time = 0;
		}
		return answer;

	}
}