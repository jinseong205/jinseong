package com.example.programmers.search;

class lv2_targetNumber {
 
	public static void main(String[] args) {

		int[] numbers = {1, 1, 1, 1, 1};
		int target = 3;
		
		lv2_targetNumber s = new lv2_targetNumber();
		System.out.println(s.solution(numbers, target));
	}
	
	
	public int solution(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(0, numbers, target, 0);	
        return answer;
    }
	
	public int dfs(int idx, int[] numbers, int target, int sum) {
		 
		
		if(idx == numbers.length) {
			 if(sum == target) {
				  return 1;
			 }
			 return 0;
		 }
		
		return dfs(idx + 1,numbers, target, sum + numbers[idx]) + dfs(idx +1, numbers, target, sum - numbers[idx]);
	}

}