// Given an array of integers A, find and return the product array of the same size where the ith element of the product array will be equal to the product of all the elements divided by the ith element of the array.
// Note: It is always possible to form the product array with integer (32 bit) values. Solve it without using the division operator.
// Input Format
// The only argument given is the integer array A.
// Output Format

// Return the product array.
// Constraints

// 2 <= length of the array <= 1000
// 1 <= A[i] <= 10
// For Example

// Input 1:
//     A = [1, 2, 3, 4, 5]
// Output 1:
//     [120, 60, 40, 30, 24]

// Input 2:
//     A = [5, 1, 10, 1]
// Output 2:
//     [10, 50, 5, 50]

package Java.src.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ProductArrayPuzzel {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array A:");
        int n = sc.nextInt();
        
        System.out.println("Enter elements of Array A:");
          
       int[] A = new int[n];
       
       for(int i=0; i<n; i++){
        A[i] = sc.nextInt();
       }

       int[] pf = new int[n];

       pf[0] = 1;

       for(int i=1; i<n; i++){
        pf[i] = pf[i - 1] * A[ i - 1];
       }

       int[] res = new int[n];
       
       int suffix = 1;

       for(int i=n-1; i>=0; i--){
        res[i] = pf[i] * suffix;
        suffix *= A[i];
       }

       System.out.println(Arrays.toString(res));
    }
}
