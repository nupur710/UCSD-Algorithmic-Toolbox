package week6_dynamic_programming;

import java.util.*;
import java.io.*;

public class Partition3 {
    private static int partition3(int[] A) {
        //write your code here
        int sum= 0;
        for(int num : A) {
            sum+= num;
        }
        if(sum % 3 != 0) {
            return 0;
        }
        int target= sum /3;
        int n= A.length;
        boolean[][] dp = new boolean[n + 1][sum + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                dp[i][j] = dp[i - 1][j];
                if (A[i - 1] <= j) {
                    dp[i][j] = dp[i][j] || dp[i - 1][j - A[i - 1]];
                }
            }
        }
        if(dp[n][target] == true) return  1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println(partition3(A));
    }
}


