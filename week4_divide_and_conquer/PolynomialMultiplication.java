package week4_divide_and_conquer;

public class PolynomialMultiplication {

    static void polymul(int[] a, int[] b) {
        int[] c= new int[(2 * a.length)-1];
        for(int i= 0; i<a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                c[i + j] = c[i+j] + ( a[i] * b[j] );
            }
        }
        for(int k= 0; k<c.length; k++)
            System.out.println(c[k]);
    }

    public static void main(String[] args) {
        int [] a= {1,2,3};
        int[] b= {1,2,3};
        polymul(a,b);
    }

}
