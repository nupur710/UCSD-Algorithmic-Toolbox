package week6_dynamic_programming;

import java.util.Scanner;

public class PlacingParentheses {
    private static long getMaximValue(String exp) {
        int length = exp.length() / 2 + 1;
        long[] digits = new long[length];
        char[] operators = new char[length - 1];

        int digitIndex = 0;
        int operatorIndex = 0;

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (i % 2 == 0) {
                digits[digitIndex++] = Long.parseLong(String.valueOf(c));
            } else {
                operators[operatorIndex++] = c;
            }
        }

        long[][] maxValues = new long[length][length];
        long[][] minValues = new long[length][length];

        for (int i = 0; i < length; i++) {
            maxValues[i][i] = digits[i];
            minValues[i][i] = digits[i];
        }

        for (int s = 0; s < length - 1; s++) {
            for (int i = 0; i < length - s - 1; i++) {
                int j = i + s + 1;
                long[] minAndMax = getMinAndMax(i, j, operators, minValues, maxValues);
                minValues[i][j] = minAndMax[0];
                maxValues[i][j] = minAndMax[1];
            }
        }

        return maxValues[0][length - 1];
    }

    private static long[] getMinAndMax(int i, int j, char[] operators, long[][] minValues, long[][] maxValues) {
        long minVal = Long.MAX_VALUE;
        long maxVal = Long.MIN_VALUE;

        for (int k = i; k < j; k++) {
            char op = operators[k];
            long a = eval(maxValues[i][k], maxValues[k + 1][j], op);
            long b = eval(maxValues[i][k], minValues[k + 1][j], op);
            long c = eval(minValues[i][k], maxValues[k + 1][j], op);
            long d = eval(minValues[i][k], minValues[k + 1][j], op);

            minVal = Math.min(minVal, Math.min(a, Math.min(b, Math.min(c, d))));
            maxVal = Math.max(maxVal, Math.max(a, Math.max(b, Math.max(c, d))));
        }

        return new long[]{minVal, maxVal};
    }

    private static long eval(long a, long b, char op) {
        if (op == '+') {
            return a + b;
        } else if (op == '-') {
            return a - b;
        } else if (op == '*') {
            return a * b;
        } else {
            assert false;
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String exp = scanner.next();
        System.out.println(getMaximValue(exp));
    }
}
