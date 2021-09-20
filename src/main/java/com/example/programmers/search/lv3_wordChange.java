package com.example.programmers.search;

public class lv3_wordChange {
	
	
	static int minChange = 999999999;
	
	public static void main(String[] args) {
		
		lv3_wordChange sol = new lv3_wordChange();
		
		String begin = "hit";
		String end = "cog";
		String[] words = {"hot","dot","dog","lot","log","cog"}; 
		System.out.println(sol.solution(begin, end, words));
	}
	
	public int solution(String begin, String target, String[] words) {
		
		int change =0;
		
		boolean isContain = false;
		
		for(String s : words) {
			if(s.equals(target)) {
				isContain = true;
				break;
			}
		}
		
		if(isContain) {
			dfs(begin, target, words, change);
		}else {
			return 0;
		}
		
		return minChange;
			
		
		
	}
	
	public int dfs(String begin, String target, String[] words, int change) {
		
		//System.out.println("---------");

		
		if(begin.equals(target)) {
			//System.out.println("<<target>>  " + target);
			if(change < minChange) {
				minChange = change;
			}
		}
		
		if(change == words.length)
		  return 0;
		
		int idx = 0;
		int isDiff = 0;
		
		for(int i = 0; i < words.length; i++) {
			
			isDiff = 0;

			if(words[i].length() == begin.length()) {
				for(int j = 0; j < begin.length(); j++ ) {
					if(begin.charAt(j) != words[i].charAt(j))
						isDiff++;
				}
			}
			
			if(isDiff == 1) {
				idx = i;

//				System.out.println("+++ change!! " + begin + " -> " + words[idx] + " change : " + change);

				String tempBegin = begin;
				String temp = words[idx];
				int tempChange = change;
				
				change ++;
				
				begin = words[idx];
				words[idx] = "";
				
				dfs(begin, target, words, change);
				
				begin = tempBegin;
				words[idx] = temp;
				change = tempChange;
			}
		}
			return 0;
	}
}
