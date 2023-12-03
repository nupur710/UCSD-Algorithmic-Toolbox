import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciLastDigit {
    private static int getFibonacciLastDigitNaive(int n) {
        ArrayList<Integer> fib= new ArrayList<Integer>();
        fib.add(0);
        fib.add(1);
        for(int i= 2; i<n; i++) {
        	fib.add(fib.get(i-1)+fib.get(i-2));
        }
        return (fib.get(n-1) % 10);
    }
    
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int c = getFibonacciLastDigitNaive(n);
//        System.out.println(c);
    	System.out.println(getFibonacciLastDigitNaive(10));
    }
}

