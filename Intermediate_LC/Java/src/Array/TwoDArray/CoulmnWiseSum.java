//You are given a 2D integer matrix A, return a 1D integer array containing column-wise sums of original matrix.
// Example Input
// [1,2,3,4]
// [5,6,7,8]
// [9,2,3,4]

// Example Output
// {15,10,13,16}



package Array.TwoDArray;

import java.util.Arrays;
import java.util.Scanner;

public class CoulmnWiseSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the number of rows of Array A:");
        int n = sc.nextInt();
        
        System.out.println("Enter the number of columns of Array A:");

        int m = sc.nextInt();
        System.out.println("Enter the elements of Array A:");

        int[][] A = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                A[i][j] = sc.nextInt();
            }
        }

       int[] res = new int[m];
       
       for(int i=0; i<m; i++){
        int sum = 0;
        for(int j=0; j<n; j++){
            sum = sum + A[j][i];
        }
        res[i] = sum;
       }
        
      System.out.println(Arrays.toString(res)); 
    }
}
