package Array;

import java.util.Scanner;

public class MaxSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of the Array A:");

        int n = sc.nextInt();

        System.out.println("Enter the elements of Array A:");

        int[] A = new int[n];

        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }

        System.out.println("Enter the value of B:");

        int B = sc.nextInt();

        sc.close();

        int[] pfSum = new int[n];

        pfSum[0] = A[0];

        for(int i=1; i<n; i++){
            pfSum[i] = A[i] + pfSum[i - 1];
        }

        int max = 0;

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int sum = pfSum[j];

                if(i != 0){
                    sum = sum - pfSum[i - 1];
                }
                if(max < sum && sum <= B){
                    max = sum;
                }
            }
        }

        System.out.println(max);
    }
}
