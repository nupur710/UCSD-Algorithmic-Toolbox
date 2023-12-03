package week3_greedy_algorithms;

import java.util.Scanner;

public class MoneyChange {
	
	  private static int getChange(int m) {
		  int a= m / 10;
		  int remA= m - (10 * a);
		  int b= remA / 5;
		  int c= m - ((10 * a)+(5*b));
		  return a + b + c;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int m = scanner.nextInt();
	        System.out.println(getChange(m));

	    }

}
