package com.example.programmers.completeSearch;

public class lv1_giveUpMath {

	public static void main(String[] args) {

		lv1_giveUpMath sol = new lv1_giveUpMath();
		
		int[] answer = {1,2,3,4,5};
		int[] a = sol.solution(answer);
		
		for(int i : a) {
			System.out.print(i + " \t");
		}
		

	}

	public int[] solution(int[] answers) {
		
		int[] answer = {};
		
		int[] p1 = {1,2,3,4,5};
		int[] p2 = {2,1,2,3,2,4,2,5};
		int[] p3 = {3,3,1,1,2,2,4,4,5,5};
		
		int[] pa = {0,0,0};
		
		for(int i = 0; i < answers.length; i ++) {
			if(answers[i] == p1[i%p1.length]) {
				pa[0]++;
			}
		}
		
		for(int i = 0; i < answers.length; i ++) {
			if(answers[i] == p2[i%p2.length]) {
				pa[1]++;
			}
		}
		for(int i = 0; i < answers.length; i ++) {
			if(answers[i] == p3[i%p3.length]) {
				pa[2]++;
			}
		}
		
		int max = 0;
		
		for(int i = 0; i < pa.length; i++) {
			if(max < pa[i]) {
				max = pa[i];
			}
		}
		
		int maxCnt = 0;
		for(int i = 0; i < pa.length; i++) {
			if(max == pa[i]) {
				maxCnt++;
		    }
		}
		
		int[] temp = new int[maxCnt];
		
		
		int idxTemp = 0;
		for(int i = 0; i < maxCnt; i++) {
			for(int j = idxTemp; j < pa.length; j++) {
				if(max == pa[j]) {
					temp[i] = j+1;
					idxTemp = j+1;
					break;
				}
			}
		}
		
		answer = temp;
		
		return answer;
	}

}
