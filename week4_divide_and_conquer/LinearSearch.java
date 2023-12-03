package week4_divide_and_conquer;

public class LinearSearch {

    static int linearSearch(int[] A, int key, int low, int high) {
        if(low > high)
            return -1;

        if(A[low] == key)
            return low;

        return linearSearch(A, key, low+1, high);

    }

    public static void main(String[] args) {
        int[] arr= {1,3,4,5,2,7,6,9,10};
        System.out.println(linearSearch(arr,7,0,arr.length));
    }

}
