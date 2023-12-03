package week3_greedy_algorithms;

import java.util.Arrays;

public class QueueOfPatients {
	
	//Time complexity is O(n^2)
	static int minTotalWaitingTime(int[] t, int n) {
		int waitingTime= 0;
		int[] treated= new int[n];
		for(int i= 0; i<n; i++) {
			int tmin= Integer.MAX_VALUE;
			int minIndex= 0;
			//finds the minimum waiting time for each iterations
			/*
			 * 1st iteration: 5 min
			 * 2nd iteration: 7 min
			 * 3rd iteration: 9 min
			 * 4th iteration: 12 min
			 */
			for(int j= 0; j<n; j++) {
				if(treated[j] == 0 && t[j] < tmin) {
					tmin= t[j];
					minIndex= j;
				}
			}
			System.out.println("Patient being treated is " + (minIndex+1));
			waitingTime= waitingTime +  tmin;
			treated[minIndex]= 1;
		}
		return waitingTime;
	}
	
	//Time complexity is O(nlogn)
	static int minTotalWaitingTimeEff(int[] t, int n) {
		Arrays.sort(t);
		int totalWaitingTime= 0;
		for(int i= 0; i<n; i++) {
			System.out.println("Patient being treated is one with time " + t[i]);
			totalWaitingTime += t[i];
		}
		return totalWaitingTime;
	}
	
	public static void main(String[] args) {
		int[] times= {12, 7, 5, 9};
		int n= 4;
		System.out.println(minTotalWaitingTime(times, n));
		System.out.println(minTotalWaitingTimeEff(times, n));
	}

}
