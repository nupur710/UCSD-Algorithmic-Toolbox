package week2_algorithmic_warmup;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class FibonacciNumbersNaive {

	  private static long calc_fib(int n) {
		    if (n <= 1)
		      return n;
		    return calc_fib(n - 1) + calc_fib(n - 2);
		  }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println(calc_fib(12));
	}

}
