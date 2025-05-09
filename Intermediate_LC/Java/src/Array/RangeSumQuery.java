package Array;
import java.util.*;


public class RangeSumQuery {

    public long[] solve(int[] A, int[][] B){
         
        long[] pf = new long[A.length];
        pf[0] = A[0];
        
        for(int i=1; i<A.length; i++){
            pf[i] = A[i] + pf[i - 1];
        }
        long[] result = new long[B.length];

        for(int i=0; i<B.length; i++){
            int left = B[i][0];
            int right = B[i][1];
            
            if(left == 0) {
                result[i] = pf[right];
            } else {
                result[i] = pf[right] - pf[left - 1]; 
            }
        }
        return result;
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array A:");
        int n = sc.nextInt();

        int[] A = new int[n];

        System.out.println("Enter the elements of array A:");
        
        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }

        System.out.println("Enter the number of queries (size of array B):");

        int m = sc.nextInt();
        
        int[][] B = new int[m][2];

        System.out.println("Enter the queries in the form of [startIndex, endIndex]");

        for(int i=0; i<m; i++) {
            B[i][0] = sc.nextInt();
            B[i][1] = sc.nextInt();
        }

        RangeSumQuery rangeSumQuery = new RangeSumQuery();

        long[] res = rangeSumQuery.solve(A, B);

        System.out.println("Range sum for the queries");

        System.out.println(Arrays.toString(res));
    }
}
