package week2_algorithmic_warmup;

import java.util.Scanner;

public class FibonacciHuge {
	    private static long getFibonacciHugeNaive(long n, long m) {
	       long a= 0;
	       long b= 1;
	       long fib= 0;
	       for(int i= 2; i<=n; i++) {
	    	   fib= ((a+b));
	    	   a= b;
	    	   b= fib;
	       }
	       return b%m;
	    }
	    
	    private static long getFibonacciHugeNaive2(long n, long m) {
	        if (n <= 1)
	            return n;

	        long previous = 0;
	        long current  = 1;

	        for (long i = 0; i < n - 1; ++i) {
	            long tmp_previous = previous;
	            previous = current;
	            current = tmp_previous + current;
	        }

	        return current % m;
	    }
	    

	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        long n = scanner.nextLong();
	        long m = scanner.nextLong();
	        System.out.println(getFibonacciHugeNaive(n, m));
	        System.out.println(getFibonacciHugeNaive2(n, m));
	        
	    }
	}




