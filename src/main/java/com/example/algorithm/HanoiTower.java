package com.example.algorithm;

public class HanoiTower {

	public static void main(String[] args) {
		HanoiTower h = new HanoiTower();
		h.solution(0);
	}
	public void solution(int n) {
		
		hanoi(3, 1,2,3);
	}
	
	void hanoi(int n, int start, int mid, int to ) {
		if(n == 1 ) {
			System.out.println(start + " -> " + to);
		    return;
		}
		
		hanoi(n - 1, start, to, mid);
		System.out.println(start + " -> " + to );
		hanoi(n - 1, mid, start, to);
	}
}
