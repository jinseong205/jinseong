package com.example.programmer.snq;

import com.example.programmer.graph.lv3_farestNode;

public class lv2_truckOnBridge {

	public static void main(String[] args) {

		

		lv2_truckOnBridge sol = new lv2_truckOnBridge();
		
		int[] truck_weights = {7,4,5,6};
		sol.solution(2,10,truck_weights);
	}

	public int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;

		int tempWeight = weight; // 남은 무게
		int truckIdx = 0; // 트럭 순번

		int truckTimes[] = new int[truck_weights.length]; // 트럭이 다리에 올라간 시간
		// int lastTruck = 0;

		while (true) {

			if (truckIdx < truck_weights.length && tempWeight - truck_weights[truckIdx] >= 0) {
				// System.out.println("--------" + truckIdx + "번 출발 " + (answer + 1) + "초
				// --------");
				tempWeight = tempWeight - truck_weights[truckIdx];
				truckIdx++; // 다음 트럭 대기
			}

			for (int idx = 0; idx < truckTimes.length; idx++) {

				if (idx <= truckIdx - 1 && truckTimes[idx] != -1) {
					truckTimes[idx]++;
				}
				if (truckTimes[idx] == bridge_length) {
					tempWeight += truck_weights[idx];
					truckTimes[idx] = -1;
				}

			}

			answer++; // 시간 초 증가

			/*
			 * if (truckIdx < truck_weights.length) { System.out.print(truckIdx +
			 * "번 출발 예정: " + answer + "초   다음 트럭 하중 : " + truck_weights[truckIdx] +
			 * "남은 하중  " + tempWeight + "    "); }
			 */

			/*
			 * for (int t : truckTimes) { System.out.print("   " + t); }
			 * System.out.println();
			 */

			// 마지막 트럭 도착시
			if (truckTimes[truckTimes.length - 1] == -1) {
				break;
			}
		}

		return answer + 1;

	}
}
