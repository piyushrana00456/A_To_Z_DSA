package Java.src.Array;

import java.util.Arrays;
import java.util.Scanner;

//Given an Array A and an Array B , A consist n elements and B have m queries and each queries have some range [left, right], return sum of odd index element b/w each range
public class OddSum {
    public int[] solve(int[] A, int[][] B,int n, int m){
       int[] pfOdd = new int[n];

       pfOdd[0] = 0;

       for(int i=1; i<n; i++){
         if(i % 2 != 0) {
             pfOdd[i] = pfOdd[i - 1] + A[i];
         }else{
            pfOdd[i] = pfOdd[i - 1];
         }
       }
       System.out.println(Arrays.toString(pfOdd));
       int[] res = new int[m];
      
       for(int i=0; i<m; i++){
        int left = B[i][0];
        int right = B[i][1];

          if(left == 0) {
            res[i] = pfOdd[right];
          }else{
            res[i] = pfOdd[right] - pfOdd[left - 1];
          }
       }   
       return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of Array A:");
        int n = sc.nextInt();
        System.out.println("Enter elements of Array A:");

        int[] A = new int[n];

        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }

        System.out.println("Enter size of Array B");

        int m = sc.nextInt();

        System.out.println("Enter range in form of [left, right]");

        int[][] B = new int[m][2];

        for(int i=0; i<m; i++){
            B[i][0] = sc.nextInt();
            B[i][1] = sc.nextInt();
        }
        sc.close();
        OddSum oddSum = new OddSum();

        int[] res = oddSum.solve(A, B, n, m);

        System.out.println(Arrays.toString(res));

    }
}
