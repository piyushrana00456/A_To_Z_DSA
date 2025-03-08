package Java.src.Array;


import java.util.*;

public class RotationGame {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        k = k % n;

        reverseArr(arr, 0, n - 1);
        reverseArr(arr, 0, k - 1);
        reverseArr(arr, k, n - 1);
       
       for(int num : arr){
          System.out.print(num +" "); 
       }
    }

    public static void reverseArr(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
