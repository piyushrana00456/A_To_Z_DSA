package Java.src.Array;

import java.lang.reflect.Array;
import java.util.*;

public class EvenSum {
    public int[] solve(int[] A, int[][] B, int n, int m){
        int[] pfEven = new int[n];
        pfEven[0] = A[0];

        for(int i=1; i<n; i++){
            if(i % 2 == 0) {
                pfEven[i] = A[i] + pfEven[i - 1];
            }else{
                pfEven[i] = pfEven[i - 1];
            }
        }
        System.out.println(Arrays.toString(pfEven));
        int[] res = new int[m];
        for(int i=0; i<m; i++){
            int left = B[i][0];
            int right = B[i][1];
         
            if(left == 0){
              res[i] = pfEven[right];  
            }else{
                res[i] = pfEven[right] - pfEven[left - 1];
            }
        }
       return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an Array A:");
        int n = sc.nextInt();

        int[] A = new int[n];

        System.out.println("Enter elements of Array A:");

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println("Enter the number of range (size of Array B):");

        int m = sc.nextInt();
        
        int[][] B = new int[m][2];
        System.out.println("Enter the range in the form of [left, right]");

        for(int i=0; i<m; i++){
           B[i][0] = sc.nextInt();
           B[i][1] = sc.nextInt();
        }
        
        EvenSum evenSum = new EvenSum();

        int[] res = evenSum.solve(A, B, n, m);

        System.out.println(Arrays.toString(res));
       
    }
}
