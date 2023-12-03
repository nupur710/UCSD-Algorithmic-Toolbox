package week2_algorithmic_warmup;

import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciLastDigiit {
    private static int getFibonacciLastDigitNaive(int n) {
        ArrayList<Integer> fib= new ArrayList<Integer>();
        fib.add(0);
        fib.add(1);
        for(int i= 2; i<=n; i++) {
        	fib.add(fib.get(i-1)+fib.get(i-2));
        }
        return (fib.get(n) % 10);
    }
    
    private static int getFibonacciLastDigitNaive2(int n) {
        if (n <= 1)
            return n;

        int previous = 0;
        int current  = 1;

        for (int i = 0; i < n - 1; ++i) {
            int tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
        }

        return current % 10;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = getFibonacciLastDigitNaive(n);
        System.out.println("imp method " + c);
        int f = getFibonacciLastDigitNaive2(n);
        System.out.println("giv method " +f);
    }
}


