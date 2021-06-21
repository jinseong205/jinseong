package com.example.jinseong;

import java.util.HashMap;
import java.util.Set;

public class hashmapTest {

	public static void main(String[] args) {

		//HashMap 은 Key 와 Value 의 쌍
		//Key는 중복 불가, Value 는 상관없음
		HashMap<String, Integer> hm = new HashMap<>();
		
		
		//hashmap Input
		hm.put("apple", 1500);
		hm.put("banana", 5000);
		hm.put("peach", 2000 );
		hm.put("pear", 1500);
		
		//value 만 변경
		hm.put("peach", 1800);

		
		//HashMap Key를 가져옴
		Set<String>key = hm.keySet();
		
		//Key를 가지고 Value 찾기
		for(String s : key) {
			System.out.println("key : " + s + "\tvalue : " + hm.get(s));
		}
		
	
	}
	

}
