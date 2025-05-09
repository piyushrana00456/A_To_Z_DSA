package Array;

import java.util.Scanner;

public class SumOfAllSubarrays { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the size of Array A:");

    int n = sc.nextInt();

    System.out.println("Enter the elements of Array A:");

    int[] A = new int[n];

    for(int i=0; i<n; i++){
        A[i] = sc.nextInt();
    }
    
    // bruteForce(A, n);
    // usingPrefixSum(A, n);
    // usingCarryForward(A, n);
    contributionTechnique(A,n);

  } 
  public static void bruteForce(int[] A, int n){
      
    int totalSum = 0;

    for(int i=0; i<n; i++){
        for(int j=i; j<n; j++){
            int sum = 0;
            for(int k=i; k<=j; k++){
                sum = sum + A[k];
            }
            totalSum = totalSum + sum;
        }
    }
    // System.out.println(totalSum);
  } 
  public static void usingPrefixSum(int[] A, int n){
    int[] prefixSum = new int[n];

    prefixSum[0] = A[0];

    for(int i=1; i<n; i++){
        prefixSum[i] = A[i] + prefixSum[i - 1];
    }
    
    int totalSum = 0;

    for(int i=0; i<n; i++){
      for(int j=i; j<n; j++){
       int sum = prefixSum[j];
        if(i!= 0) {
            sum = sum - prefixSum[i - 1];
        }
        totalSum = totalSum + sum;
      }
    }

    // System.out.println(totalSum);
  }
  public static void usingCarryForward(int[] A, int n){
      int totalSum = 0;
      for(int i=0; i<n; i++){
        int sum = 0;
        for(int j =i; j<n; j++){
            sum += A[j];
            totalSum+= sum;
        }
      } 
      System.out.println(totalSum);
  }

  public static void contributionTechnique(int[] A, int n){
    int totalSum = 0;

    for(int i=0; i<n; i++){
        int freq = (i + 1)*(n - i);
        totalSum = totalSum + (freq)*A[i];
    }

    System.out.println(totalSum);
  }
}
