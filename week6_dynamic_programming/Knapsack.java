package week6_dynamic_programming;

import java.util.*;

public class Knapsack {
    static int optimalWeight(int W, int[] w) {
        //write you code here
        int n= w.length;
        int[][] gold_and_wt= new int[n+1][W+1];
        for(int i= 1; i<=n; i++) {
            for(int weight= 1; weight <= W; weight++) {
                gold_and_wt[i][weight]= gold_and_wt[i-1][weight];
                if(w[i-1] <= weight) {
                    int val= gold_and_wt[i-1][weight - w[i - 1]] + w[i - 1];
                    if (val > gold_and_wt[i][weight]) {
                        gold_and_wt[i][weight] = val;
                    }
                }
            }
        }
        int result = gold_and_wt[n][W];
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W, n;
        W = scanner.nextInt();
        n = scanner.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }
        System.out.println(optimalWeight(W, w));
    }
}

