package week4_divide_and_conquer;

import java.util.Scanner;

public class GuessANumber {

    static void guessNumber(int a, int b, int actual, int count, int attempts) {
       if(count >  attempts){
           System.out.println("Out of attempts!");
           return;
       }
            Scanner sc = new Scanner(System.in);
            System.out.println("Guess a no. between " + a + " and " + b);
            int guess = sc.nextInt();
        if(!(assertion(a,b,guess)))
            return;
        if (guess == actual)
                System.out.println("Congrats!! Correct guess! No. is " + actual);
        else if (guess < actual) {
                count++;
                guessNumber(guess, b, actual, count, attempts);
            } else {
                count++;
                guessNumber(a, guess, actual, count, attempts);
            }
    }

    static boolean assertion(int lower, int upper, int inRange) {
        if(inRange<lower || inRange>upper) {
            System.out.println("Out of range. Try again.");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int b= 15;
        int attempts= (int) (Math.log(b) / Math.log(2)) + 1;
        guessNumber(1,b,13, 1, attempts);

    }

}
