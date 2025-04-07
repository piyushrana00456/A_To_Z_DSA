//Given an Array A of N non-negative numbers and a non-negative number B, need to find the count of subarrays in A with summ of less than B.

package Java.src.Array;

import java.util.Scanner;

public class CountingSubarray {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter the size of Array A:");

      int n = sc.nextInt();

      System.out.println("Enter the elemenrts of the Array A:");

      int[] A = new int[n];

      for(int i=0; i<n; i++){
        A[i] = sc.nextInt();
      }

      System.out.println("Enter value for B:");

      int B = sc.nextInt();

      sc.close();

      int[] pfSum = new int[n];

      pfSum[0] = A[0];

      for(int i=1; i<n; i++){
        pfSum[i] = A[i] + pfSum[i - 1];
      }

      int count = 0;

      for(int i=0; i<n; i++){
        for(int j=i; j<n; j++){
            int sum = pfSum[j];

            if(i!=0){
                sum = sum - pfSum[i - 1];
            }

            if(sum < B){
                count++;
            }
        }
      }

      System.out.println(count);
   } 
}
