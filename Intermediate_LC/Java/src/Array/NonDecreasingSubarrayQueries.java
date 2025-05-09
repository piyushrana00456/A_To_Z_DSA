// Problem Description
// Given an array A of size N. You will be given M queries to process. Each query will be of the form B[i][0] B[i][1].
// If the subarray from B[i][0] to B[i][1] is non decreasing, the output should be 1 else output should be 0.
// Return an array of integers answering each query.
 

// Problem Constraints

// 1 <= N <= 105
// 1 <= A[i] <= 109
// 1 <= M <= 105
// 0 <= B[i][0], B[i][1] <= N-1

// Input Format

// First argument contains the array A.Second argument contains B,denoting the queries.Output Format Return an array of integers consisting of 0 and 1 
// Example Input 
// Input 1:A=[1,7,3,4,9]B=[[0,1],[1,4]]
// Input 2:A=[1,1,7,2,3]B=[[0,2],[2,4]]
// Example Output 
// Output 1:[1,0]
// Output 2:[1,0]

package Array;

import java.util.Arrays;
import java.util.Scanner;

public class NonDecreasingSubarrayQueries {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the size of an Array A:");

        int n = sc.nextInt();
        
        int[] A = new int[n];
        System.out.println("Enter the element of Array:");
           
        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }

        int[] pf = new int[n];

        pf[0] = 0;

        for(int i=1; i<n; i++){
            pf[i] = pf[i-1];

            if(A[i - 1] > A[i]){
                pf[i]++;
            }
        }

        
        System.out.println("Enter number of range of Array B:");
        
        int m = sc.nextInt();
        
        System.out.println("Enter range in from of [left, right]");
        
        int[][] B = new int[m][2];
        
        for(int i=0; i<m; i++){
            B[i][0] = sc.nextInt();
            B[i][1] = sc.nextInt(); 
        }
        
        int[] res = new int[m];

        for(int i=0; i<m; i++){
            int l = B[i][0];
            int r = B[i][1];

            if(pf[r] == pf[l]){
                res[i] = 1;
            }else{
                res[i] = 0;
            }
        }
        
        System.out.println(Arrays.toString(res));
         
    }
    
}
