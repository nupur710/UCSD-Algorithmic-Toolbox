package week2_algorithmic_warmup;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
	
	public static long calc_fib(int n) {
		ArrayList<Integer> fib= new ArrayList<Integer>();
		fib.add(0);
		fib.add(1);
		for(int i= 2; i<=n; i++) {
			fib.add(fib.get(i-1)+fib.get(i-2));
		}
		return fib.get(n);
	}
	
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int n= in.nextInt();
		System.out.println(calc_fib(n));
	}

}
