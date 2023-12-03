package week2_algorithmic_warmup;

import java.util.Scanner;

public class LCM {
	  private static long lcm(int a, int b) {
	    return (a * b)/hcf(a,b);
	  }
	  
	  private static long hcf(int a, int b) {
		  if(b == 0)
			  return a;
		  int apr= a % b;
		  return hcf(b, apr);
	  }

	  public static void main(String args[]) {
	    Scanner scanner = new Scanner(System.in);
	    int a = scanner.nextInt();
	    int b = scanner.nextInt();
	    System.out.println(lcm(a, b));
	  }
	}



