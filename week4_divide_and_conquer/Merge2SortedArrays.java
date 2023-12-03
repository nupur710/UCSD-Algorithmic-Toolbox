package week4_divide_and_conquer;

public class Merge2SortedArrays {
    static void merge(int[] a, int[] b) {
        int[] merged= new int[a.length+b.length];
        int i= 0,j=0;
        int z= 0;
        while (i<a.length && j<b.length) {
            if(a[i] <= b[j]) {
                merged[z]= a[i];
                i++;
            } else if (b[j] < a[i]) {
                merged[z]= b[j];;
                j++;
            }
            z++;
        }
        //add missing elements
        for(int y= i; y<a.length; y++) {
            merged[z]= a[y];
            z++;
        }
        for(int y= j; y<b.length; y++) {
            merged[z]= b[y];
            z++;
        }
        //print array
        for(int l= 0; l<merged.length; l++)
            System.out.println(merged[l]);
    }

    public static void main(String[] args) {
        int[] x= {10,15,20};
        int[] y= {5,6,6,25};
        merge(x,y);
    }

    //merge funtion of merge sort
    static void mergefunction(int[] a, int l, int r) {
        int mid= l + (r-l)/2;
        int n1= mid-l+1;
        int n2= r-mid;
        int[] x= new int[n1];
        int[] y= new int[n2];
        for(int i= 0; i<n1; i++) {
            x[i]=a[l+i];
        }
        for(int i= 0; i<n1; i++) {
            y[i]=a[mid+i+1];
        }


        int[] merged= new int[x.length+y.length];
        int i= 0,j=0;
        int z= 0;
        while (i<x.length && j<y.length) {
            if(x[i] <= y[j]) {
                merged[z]= x[i];
                i++;
            } else if (y[j] < x[i]) {
                merged[z]= y[j];;
                j++;
            }
            z++;
        }
        //add missing elements
        for(int m= i; m<x.length; m++) {
            merged[z]= x[m];
            z++;
        }
        for(int q= j; q<y.length; q++) {
            merged[z]= y[q];
            z++;
        }
    }



}
