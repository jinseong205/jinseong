package com.example.test;

public class Fibo {

	public static void main(String[] args) {
		Fibo f = new Fibo();
		System.out.println(f.solution(5));
	}

	public int solution(int n) {
		int answer = 0;
		answer = fibo(n);
		return answer;
	}

	public int fibo(int n) {
		if (n == 1)
			return 1;
		if (n == 2)
			return 1;
		return fibo(n - 1) + fibo(n - 2);
	}

}
