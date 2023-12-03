package week5_dynamic_programming;

import java.util.Arrays;
import java.util.Scanner;

public class LCS {
    static int[][] memo;
    private static int lcs2(int[] a, int[] b) {
        //Write your code here
        int m = a.length;
        int n = b.length;

        // Create a memoization table to store intermediate results
        int[][] memo = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (a[i - 1] == b[j - 1]) {
                    memo[i][j] = 1 + memo[i - 1][j - 1];
                } else {
                    memo[i][j] = Math.max(memo[i - 1][j], memo[i][j - 1]);
                }
            }
        }

        return memo[m][n];
        }

//        private static int lcs(int[] a, int[] b, int m, int n, int[][] memo) {
//        if(m == 0 || n == 0) {
//            return 0;
//        }
//        if(memo[m][n] != -1) {
//            return memo[m][n];
//        }
//        if(a[m-1] == b[n=1]) {
//            memo[m][n]= 1+ lcs(a, b, m-1, n-1, memo);
//        } else {
//            Math.max(lcs(a,b,m-1,n, memo), lcs(a,b,m,n-1, memo));
//        }
//        return (memo[m][n]);
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }

        System.out.println(lcs2(a, b));
    }
}
