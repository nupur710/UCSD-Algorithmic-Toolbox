package week4_divide_and_conquer;

import java.util.*;
import java.io.*;

public class MajorityElement {

    private static int countOccurence(int[] arr, int num) {
        int count= 0;
        for(int i= 0; i<arr.length; i++) {
            if(arr[i] == num)
                count++;
        }
        return count;
    }
    private static int getMajorityElement(int[] a, int left, int right) {

        if (left == right) {
            return -1;
        }
        if (left + 1 == right) {
            return a[left];
        }
        int v= right-1;
        int mid= left + (right-left)/2;
        int leftMajority= getMajorityElement(a,left,mid);
        int rightMajority= getMajorityElement(a, mid+1, v);
        if(leftMajority == rightMajority) {
            return leftMajority;
        }
        int countLeft= countOccurence(a, leftMajority);
        int countRight= countOccurence(a, rightMajority);
        if(countLeft > countRight)
            return countLeft;
        else return countRight;
}

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        if (getMajorityElement(a, 0, a.length) != -1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
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

