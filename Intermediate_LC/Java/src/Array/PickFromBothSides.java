package Java.src.Array;

import java.util.Scanner;

public class PickFromBothSides {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of the Array A:");

        int n = sc.nextInt();

        int[] A = new int[n];
        
        System.out.println("Enter elements of Array A:");

        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }

        System.out.println("Enter B");
        int B = sc.nextInt();

        int k = 0;
        int sum = 0;
        while(k < B){
            sum+= A[k];
            k++;
        }  
        int max = sum;

        int j = n;

        while(j > n - B && k > 0){
            sum += A[--j] - A[--k];

            max = Math.max(max, sum);
        }
        sc.close();
        System.out.println(max);
    }
    
}
