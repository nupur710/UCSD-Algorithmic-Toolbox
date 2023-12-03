package week1;

import java.util.ArrayList;

public class StressTest {
	
	//generate random inputs
	static void generateRandom() {
		while(true) {
		int n= (int) (Math.random() * 10) + 2;
		ArrayList<Integer> al= new ArrayList<Integer>();
		System.out.println("n is " + n);
		for(int i= 0; i<n; i++) {
			al.add((int) (Math.random() * 10000));
		}
		
		System.out.println(al);
		int res1= maxProduct(al,n);
		int res2= maxProduct2(al, n);
		if(res1 == res2) {
			System.out.println("OK");
			System.out.println("Result 1 " + maxProduct(al,n));
			System.out.println("Result 2 " + maxProduct2(al, n));
		}
		else {
			System.out.println("Not OK");
			System.out.println("Result 1 " + maxProduct(al,n));
			System.out.println("Result 2 " + maxProduct2(al, n));
		}
		}
	}
	
	//brute force
	static int maxProduct(ArrayList<Integer> arr, int n) {
		int res= 0;
		for(int i= 0; i<n; i++) {
			for(int j= i+1; j<n; j++) {
				if(arr.get(i) * arr.get(j) > res) {
					res= arr.get(i) * arr.get(j);
				}
			}
		}
		return res;
	}
	
	//efficient method
	static int maxProduct2(ArrayList<Integer> arr, int n) {
		int max1= arr.get(0), max2= arr.get(1);
		//find max 1
		for(int i= 1; i<n; i++) {
			if(arr.get(i)>max1) {
				max1= arr.get(i);
			}
			
		}
		//find max2
		for(int j= 0; j<n; j++) {
			if(arr.get(j) > max2 && arr.get(j) != max1) {
				max2= arr.get(j);
			}
			
		}
		
		return max1 * max2;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> arr= new ArrayList<Integer>();
		arr.add(9);
		arr.add(4);
		arr.add(8);
		arr.add(1);
		int n= 4;
//		System.out.println(maxProduct(arr, n));
//		System.out.println(maxProduct2(arr, n));
		generateRandom();
//		long a= 2147483640;
//		long b= 10;
//		System.out.println(a+b);
	}

}
