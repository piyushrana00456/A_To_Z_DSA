//Given an array A of integers of size N
// Task is to find the equilibrium index of the given array
//The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.

package Array;

import java.util.Scanner;

public class EquilibriumIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array A:");

        int n = sc.nextInt();

        int[] A = new int[n];

        System.out.println("Enter elements of array A:");

        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }

        int[] pf = new int[n];

        pf[0] = A[0];

        for(int i=1; i<n; i++){
            pf[i] = A[i] + pf[i - 1];
        }

        for(int j=0; j<n; j++) {
            int left = 0;

            if(j > 0) {
                left = pf[ j - 1];
            }

            int right = pf[n - 1] - pf[j];


            if(left == right) {
               System.out.println(j);
               break;
            }
        }

        System.out.println(-1);
    }
}
