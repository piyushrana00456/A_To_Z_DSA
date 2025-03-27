package Java.src.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SpecialIndex {

    public int solve(int[] A, int n){

        int[] pfEven = new int[n];

        pfEven[0] = A[0];

        for(int i=1; i<n; i++){
            if(i % 2 == 0){
                pfEven[i] = A[i] + pfEven[i - 1];
            }else{
                pfEven[i] = pfEven[i - 1];
            }
        }

        int[] pfOdd = new int[n];

        pfOdd[0] = 0;

        for(int i=1; i<n; i++){
            if(i % 2 != 0){
                pfOdd[i] = A[i] + pfOdd[i - 1];
            }else{
                pfOdd[i] = pfOdd[i - 1];
            }
        }
      System.out.println(Arrays.toString(pfEven));
      System.out.println(Arrays.toString(pfOdd));
        int count = 0;

        for(int i=0; i<n; i++){
            int se = pfOdd[n - 1] - pfOdd[i];
            if(i != 0) se = se + pfEven[i - 1];

            int so = pfEven[n - 1] - pfEven[i];
            if(i != 0) so = so + pfOdd[ i - 1];

            if(se == so) count++;
        }
        
        return count;

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

       SpecialIndex specialIndex = new SpecialIndex();
       int res = specialIndex.solve(A, n);

       System.out.println(res);
    }
    
}

// public class Solution {
 
//     public int solve(ArrayList<Integer> A){

//     }
    
// }