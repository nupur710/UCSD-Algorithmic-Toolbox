package week5_dynamic_programming;

import java.util.Scanner;

public class EditDistance {

    public static int EditDistance(String s, String t) {
        //write your code here
        int m= s.length();
        int n= t.length();
        return eD(s,t,m,n);
    }
    static int eD(String s1, String s2, int m, int n)
    {
        int dp[][]= new int[m+1][n+1];

        for(int i=0;i<=m;i++)
        {
            dp[i][0]=i;
        }

        for(int j=0;j<=n;j++)
        {
            dp[0][j]=j;
        }

        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1];
                }
                else
                {
                    dp[i][j] = 1 + Math.min(dp[i-1][j], Math.min(dp[i][j-1],
                            dp[i-1][j-1]));

                }
            }
        }

        return dp[m][n];
    }
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        String t = scan.next();

        System.out.println(EditDistance(s, t));

    }
}
