//Given an array A, Have to find second largest element in array;
package Array;

import java.util.*;

public class secondLargest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr [] = new int[n];

        for(int i=0; i<n; i++){
           arr[i] = sc.nextInt(); 
        }

        int largest = arr[0];
        int secondLargest = -1;

        for(int i = 1; i<n; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }

        for(int i=0; i<n; i++){
            if(secondLargest < arr[i] && arr[i] < largest){
                secondLargest = arr[i];
            }
        }

        System.out.println(secondLargest);
    }
}

