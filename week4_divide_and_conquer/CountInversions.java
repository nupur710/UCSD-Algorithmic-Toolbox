package week4_divide_and_conquer;

import java.util.*;

    public class CountInversions {

        private static long getNumberOfInversions(int[] a, int[] b, int left, int right) {
            long numberOfInversions = 0;
            if (right <= left + 1) {
                return numberOfInversions;
            }
            int ave = (left + right) / 2;
            numberOfInversions += getNumberOfInversions(a, b, left, ave);
            numberOfInversions += getNumberOfInversions(a, b, ave, right);
            //write your code here
            int i = left;
            int j = ave;
            int k = left;
            while (i < ave && j < right) {
                if (a[i] <= a[j]) {
                    b[k++] = a[i++];
                } else {
                    b[k++] = a[j++];
                    numberOfInversions += ave - i;
                }
            }

            while (i < ave) {
                b[k++] = a[i++];
            }

            while (j < right) {
                b[k++] = a[j++];
            }

            System.arraycopy(b, left, a, left, right - left);
            return numberOfInversions;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            int[] b = new int[n];
            System.out.println(getNumberOfInversions(a, b, 0, a.length));
        }
    }



