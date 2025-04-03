package Java.src.Array;

import java.util.Scanner;

public class SubArrayWithLeastAvg {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of an Array A:");

    int n = sc.nextInt();

    System.out.println("Enter the elements of the Array A:");

    int[] A = new int[n];

    for(int i = 0; i<n; i++){
        A[i] = sc.nextInt();
    }
    
    System.out.println("Enter the value of B:");

    int B = sc.nextInt();

    sc.close();

    int min = Integer.MAX_VALUE;
    int index = 0;

    for(int i =0; i<= n - B; i++){
        int sum = 0;
        for(int j=i; j < B + i; j++){
            sum = sum + A[j];
        }
        if(sum < min){
            min = sum;
            index = i;
        }
    }
    System.out.println(index); 
   } 
}
