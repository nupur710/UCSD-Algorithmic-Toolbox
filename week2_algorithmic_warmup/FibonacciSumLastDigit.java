package week2_algorithmic_warmup;

import java.util.*;

public class FibonacciSumLastDigit {
	private static long getFibonacciSumNaive(long n) {
		ArrayList<Integer> fib= new ArrayList<Integer>();
		fib.add(0);
		fib.add(1);
		int sum= fib.get(0)+fib.get(1);
		for(int i= 2; i<=n; i++) {
			fib.add(fib.get(i-1)+fib.get(i-2));
			sum+= fib.get(i);
		}
		return sum % 10;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		long s = getFibonacciSumNaive(n);
	}
}
