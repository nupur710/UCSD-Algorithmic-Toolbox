package week2_algorithmic_warmup;

public class LastDigitOfPartialSumOfFibNumber {

    static void lastDigit(int m, int n) {
        int[] arr= new int[n];
        arr[0]= 0;
        arr[1]= 1;
        for(int i= 2; i< arr.length; i++) {
            arr[i]= (arr[i-1]%10) + (arr[i-2]%10);
        }
        for(int j= 0; j<arr.length; j++)
            System.out.println(arr[j]);
    }

    public static void main(String[] args) {
        lastDigit(17, 10);
    }

}
