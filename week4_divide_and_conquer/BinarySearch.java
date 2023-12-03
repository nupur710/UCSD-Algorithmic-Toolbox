package week4_divide_and_conquer;

public class BinarySearch {

    static int binarySearch(int[] A, int low, int high, int key) {
        if(low>high)
            return low-1;
        int mid= (int) Math.floor(low + (high-low)/2);
        if(key == A[mid])
            return mid+1;
        else if(key<A[mid])
            return binarySearch(A,low,mid-1,key);
        else
            return binarySearch(A,mid+1,high,key);
    }

    public static void main(String[] args) {
        int[] A= {3,5,8,20,20,50,60};
        System.out.println(binarySearch(A, 0, A.length, 60));
    }

}
