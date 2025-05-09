package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class LeadersInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an Arrray A:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of an Array A");

        int[] A = new int[n];

        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }

        int max = A[n - 1];
        
        ArrayList<Integer> ls = new ArrayList<>();

        ls.add(max);

        for(int i= n - 2; i>=0; i--){
            if(A[i] > max){
                max = A[i];
                ls.add(A[i]);
            }
        }
       sc.close();
       System.out.println(ls); 
    }
}
