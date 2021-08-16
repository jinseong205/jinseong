package com.example.programmers.greedy;

import java.util.Arrays;

public class lv2_lifeBoat {

	public static void main(String[] args) {

		lv2_lifeBoat sol = new lv2_lifeBoat();

		int people[] = {60,50,70,50};
		int limit = 100;
		System.out.println(
				sol.solution(people, limit));
	}
	public int solution(int[] people, int limit) {
		
		int answer = 0;
		int flag = 1;
		int temp = 0;
		int k = people.length - 1	; 

		Arrays.sort(people);

		for(int i = 0; i < people.length; i++){
			if(people[i] == -1)
			  continue;
			temp = 0;
			
			if(flag == 1){
			  flag = 0;
			  temp = limit - people[i];
			  for(int j = k; j > i; j--){
				  if(people[j] != -1 && temp >= people[j]){
					k = j;
					flag = 1;
					people[j] = -1;
				  	break;
				  }
			  }
			}
			people[i] = -1;
			answer ++;
		}

		return answer;
	}
}
