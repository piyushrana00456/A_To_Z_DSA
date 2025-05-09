package Array;

import java.util.*;

public class MultipleLeftRotation {
    
    public int[][] solve(int[] A, int[] B){
        int[][] result = new int[B.length][A.length];
        int N = A.length; 
        for(int i=0; i<B.length; i++){
            int k = B[i] % N;
            int[] rotatedArr = A.clone();

            reverseArr(rotatedArr, 0, N - 1);
            reverseArr(rotatedArr, N - k, N - 1);
            reverseArr(rotatedArr, 0, N - k - 1);

            result[i] = rotatedArr;
        }

        return result;
    }

    public int[] reverseArr(int[] A, int left, int right){
       
        while(left < right) {
            int temp = A[left];
            A[left] = A[right];
            A[right] = temp;
            left++;
            right--;
        }
        return A;
    } 

    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the size of array A:");

      int n = sc.nextInt();

      int[] A = new int[n];
      
      System.out.println("Enter element of arrya A:");

      for(int i=0; i<n; i++){
        A[i] = sc.nextInt();
      }
      
      System.out.println("Enter size of array B:");

      int m = sc.nextInt();

      int[] B = new int[m];

      System.out.println("Enter element of array B:");

      for(int i=0; i<m; i++){
        B[i] = sc.nextInt();
      }
      
      MultipleLeftRotation multipleLeftRotation = new MultipleLeftRotation();

      int[][] result = multipleLeftRotation.solve(A, B);

     System.out.println("Print left rotated Array");

    for (int[] rotated : result) {
            System.out.println(Arrays.toString(rotated));
    }

    sc.close();

    }
}
