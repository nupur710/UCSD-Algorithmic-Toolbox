package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxPairwiseProduct {
	
	static long getMaxPairwiseProduct(int[] numbers) {
		long prod= 0;
		long max= 0;
		for(int i= 0; i<numbers.length-1; i++) {
			for(int j= i+1; j<numbers.length; j++) {
				prod= numbers[i] * numbers[j];
				if(prod > max) {
					max= prod;
				}
			}
		}
		return max;
	}
	
	static long getMaxPairwiseProduct2(int[] nums) {
		long max1= 0;
		long max2= 0;
		for(int i = 0; i<nums.length; i++) {
			if(nums[i] > max1) {
				max1= nums[i];
			}
		}
		for(int j= 0; j<nums.length; j++) {
			if(nums[j] > max2 && nums[j]!= max1) {
				max2= nums[j];
			}
		}
		return max1 * max2;
	}
	
//	static long getMaxPairwiseProduct3(int[] nums) {
//		int maxIndex1= 0;
//		int maxIndex2= 0;
//		for(int i= 0; i<nums.length; i++) {
//			if(nums[i]>nums[maxIndex1]) {
//				maxIndex1= i;
//			}
//		}
//		for(int j= 0; j<nums.length; j++) {
//	
//			if((nums[j] != nums[maxIndex1]) && (nums[j]>nums[maxIndex2]))
//				maxIndex2= j;	
//		}
//		System.out.println(nums[maxIndex1] + " " + nums[maxIndex2] + " ans ");
//		return nums[maxIndex1] * nums[maxIndex2];
//	}
	
	public static void main(String[] args) {
		//Read input
		FastScanner fastscanner= new FastScanner(System.in);
		int n= fastscanner.nextInt();
		int[] numbers= new int[n];
		for(int i= 0; i<n; i++) {
			numbers[i]= fastscanner.nextInt();
		}
		System.out.println("Max product 1 is " + getMaxPairwiseProduct(numbers));
		System.out.println("Max product 2 is " + getMaxPairwiseProduct2(numbers));
//		System.out.println("Max product 3 is " + getMaxPairwiseProduct3(numbers));
	}
	
	static class FastScanner {
		BufferedReader br;
		StringTokenizer st;
		
		FastScanner(InputStream stream) {
			br= new BufferedReader(new InputStreamReader(stream));
		}
		String next() {
			while(st == null || !st.hasMoreTokens()) {
				try {
					st= new StringTokenizer(br.readLine());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
	}


}
