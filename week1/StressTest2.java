package week1;

import java.util.ArrayList;
import java.util.Collections;

public class StressTest2 {
	
	static void generateRandom() {
		while(true) {
			ArrayList<Integer> al= new ArrayList<Integer>();
			int n= (int) (Math.random() * 100) + 2;
//			System.out.println("length of array is " + n);
			for(int i= 0; i<n; i++) {
				int x= (int) (Math.random() * 100000);
				al.add(x);
			}
			long res1= maxProduct1(al);
			long res2= maxProduct2(al);
			if(res1 == res2) {
//				System.out.println("SAME");
//				System.out.println("Result of method 1 " + res1);
//				System.out.println("Result of method 2 " + res2);	
			}
			if(res1 != res2) {
				System.out.println("NOT SAME");
				System.out.println("Result of method 1 " + res1);
				System.out.println("Result of method 2 " + res2);	
			}
		}
	}
	
	static long maxProduct1(ArrayList<Integer> al) {
		Collections.sort(al);
		int ind= al.size();
		return (al.get(ind-1) * al.get(ind-2));
	}
	
	static long maxProduct2(ArrayList<Integer> al) {
		int max1= 0;
		int max2= 0;
		for(int i= 0; i<al.size(); i++) {
			if(al.get(i) > max1) {
				max1= al.get(i);
			}
		}
		for(int j= 0; j<al.size(); j++) {
			if(al.get(j) > max2 && al.get(j) != max1) {
				max2= al.get(j);
			}
		}
		return max1 * max2;
	}
	
	public static void main(String[] args) {
		generateRandom();
	}

}