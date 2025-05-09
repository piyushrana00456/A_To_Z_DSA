// Problem Description

// Given an integer array A of size N.In one second,you can increase the value of one element by 1. Find the minimum time in seconds to make all elements of the array equal.Problem Constraints

// 1<=N<=1000000 1<=A[i]<=1000 Input Format

// First argument is an integer array A.Output Format

// Return an integer denoting the minimum time to make all elements equal.
// Example 
// Input A=[2,4,1,3,2]
// Example 
// Output 8 
// Example Explanation We can change the array A=[4,4,4,4,4].The time required will be 8 seconds.

package Array;

import java.util.Scanner;

public class TimeToEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an Array A:");

        int n = sc.nextInt();

        System.out.println("Enter the elements of Array A:");

        int[] A = new int[n];

        for(int i = 0; i<n; i++){
            A[i]= sc.nextInt();
        }

        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            max= Math.max(max, A[i]);
        }


        int sec = 0;

        for(int i=0; i<n; i++){
            sec = sec + (max - A[i]);
        }

        System.out.println(sec);
    }
}
