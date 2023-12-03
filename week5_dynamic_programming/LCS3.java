package week5_dynamic_programming;

import java.util.Arrays;
import java.util.Scanner;

public class LCS3 {
    static int[][][] memo;

    private static int lcs3(int[] a, int[] b, int[] c) {
        int m = a.length;
        int n = b.length;
        int o = c.length;
        memo = new int[m + 1][n + 1][o + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= o; k++) {
                    if (i == 0 || j == 0 || k == 0)
                        memo[i][j][k] = 0;
                    else if (a[i - 1] == b[j - 1] && b[j - 1] == c[k - 1])
                        memo[i][j][k] = 1 + memo[i - 1][j - 1][k - 1];
                    else
                        memo[i][j][k] = Math.max(Math.max(memo[i - 1][j][k], memo[i][j - 1][k]), memo[i][j][k - 1]);
                }
            }
        }
        return memo[m][n][o];
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
        int an = scanner.nextInt();
        int[] a = new int[an];
        for (int i = 0; i < an; i++) {
            a[i] = scanner.nextInt();
        }
        int bn = scanner.nextInt();
        int[] b = new int[bn];
        for (int i = 0; i < bn; i++) {
            b[i] = scanner.nextInt();
        }
        int cn = scanner.nextInt();
        int[] c = new int[cn];
        for (int i = 0; i < cn; i++) {
            c[i] = scanner.nextInt();
        }
        System.out.println(lcs3(a, b, c));
    }
}

