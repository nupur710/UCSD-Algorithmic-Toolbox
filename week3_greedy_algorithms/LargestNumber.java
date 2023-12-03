package week3_greedy_algorithms;

public class LargestNumber {
	
	static int largestNumber(int[] n) {
		int largestNumber= 0;
		int[] arr_indexes= new int[n.length];
		for(int i= 0; i<n.length; i++) {
			int largest= Integer.MIN_VALUE;
			int index= 0;
			for(int j= 0; j<n.length; j++) {
				if(arr_indexes[j] == 0 && n[j] > largest) {
					largest= n[j];
					index= j;
				}
			}
			arr_indexes[index]= 1;
			largestNumber= (largestNumber* 10) + largest;
		}
		return largestNumber;
	}
	
	public static void main(String[] args) {
		int[] nums= {3, 6, 1, 9, 7, 4};
		System.out.println(largestNumber(nums));
	}

}
