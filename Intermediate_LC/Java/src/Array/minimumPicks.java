//Given An array return the diff b/w Max among all the even numbers of A and Min of all the odds of A.

package Java.src.Array;

import java.util.*;

public class minimumPicks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int Max_Even_Number = Integer.MIN_VALUE;
        int Min_Odd_Number = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i] % 2 == 0){
              if(Max_Even_Number < arr[i]){
                Max_Even_Number = arr[i];
              }
            }else {
                if(arr[i] < Min_Odd_Number){
                    Min_Odd_Number = arr[i];
                }
            }
        }

        System.out.print(Max_Even_Number - Min_Odd_Number);
    }
}