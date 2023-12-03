package week3_greedy_algorithms;

import java.util.Scanner;

public class CarFueling {

    static int computeMinRefills(int dist, int tank, int[] stops) {
    	int temp= tank;
    	int resettingCount= 0;
    	int disToNextStop= 0;
    	for(int i= 0; i<stops.length-1; i++) {
    		int toTravel= stops[i+1]-stops[i];
    		if(toTravel>temp)
    			return -1;
    	}
    	for(int i= 0; i<stops.length-1; i++) {
    		if(i == 0) {
    			disToNextStop= stops[i];
    			tank= tank-disToNextStop;
    			if(tank>disToNextStop) {
    				continue;
    			}
    		}
   		disToNextStop= stops[i+1]-stops[i];
   		tank=tank-disToNextStop;
   		if(tank<disToNextStop) {
   			tank= temp;
   			resettingCount++;
   			continue;
   		}
    	if(tank>disToNextStop) {
    			continue;
    		}
    	}
    	
        return resettingCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dist = scanner.nextInt();
        int tank = scanner.nextInt();
        int n = scanner.nextInt();
        int stops[] = new int[n];
        for (int i = 0; i < n; i++) {
            stops[i] = scanner.nextInt();
        }
        
        int dist1= 10;
        int tank1= 3;
        int[] stops1= {1,2,5,9};
        System.out.println(computeMinRefills(dist1, tank1, stops1));
    }


}
