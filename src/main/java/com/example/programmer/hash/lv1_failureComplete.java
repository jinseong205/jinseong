package com.example.programmer.hash;

import java.util.Arrays;

//sucess 100/100
public class lv1_failureComplete {

	public static void main(String[] args) {
		String[] participant = {"kim","lee","jeong"};
		String[] completion = {"kim","lee"};
		
		lv1_failureComplete a = new lv1_failureComplete();
		System.out.println(a.solution(participant, completion));
	}
	
	public String solution(String[] participant, String[] completion) {
        
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		String answer = "";
		
		for(int i = 0; i < participant.length -1 ; i++) {
			//System.out.println("idx" + i + "  " + participant[i] + " " + completion[i]);
			
			if(!participant[i].equals(completion[i])) {
				
				answer = participant[i];
				break;
			}
		}
		if(answer.equals("")) {
			answer = participant[participant.length - 1];
		}
		
		
		/*	50.0/100.0
		ArrayList<String> list = new ArrayList<String>();
		
		for(String s : participant) {
			list.add(s);
		}
		for(String s: completion) {
			list.remove(s);
		}
		String answer = list.get(0);
		*/
		
		return answer;
    }
}
