package week3_greedy_algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CelebrationParty {
	
	 static int celebrationParty(int[] childrenAges) {
		Arrays.sort(childrenAges);
		HashMap<Integer, Integer> leftAndRight= new HashMap<Integer,Integer>();
		ArrayList<Integer> al= new ArrayList<Integer>();
		int left= 1;
		int x= 0;
		int n= childrenAges.length;
		while(left<n) {
			leftAndRight.put(left, left+2);
			x++;
			left= left+1;
			while(left<=n && childrenAges[left] <= left+2) {
				left= left+1;
			}
		}
		return x;
		 
	 }
	 
	 static int getGroups(float[] children) {
		 
		    int lastChild = children.length;
		    int currentChild=1;
		    int startingPoint=0;
		    int groups=0;

		    while(currentChild<lastChild){

		        if(children[currentChild]-children[startingPoint]>1){
		            startingPoint=currentChild ;
		            groups++;
		        }


		        if(currentChild==lastChild-1){
		            groups++;
		        }
		        currentChild++;
		    }


		    return groups;
	}
	
	public static void main(String[] args) {
		int[] chh= {3, 5, 6, 4, 1, 9, 10, 11};
		System.out.println(celebrationParty(chh));
	}

}
