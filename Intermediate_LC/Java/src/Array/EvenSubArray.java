//Given an Array A check whether we can create one or more subarray of even length and each subarray's first or last ele should be even if it possible return YES else NO

package Array;

import java.util.Scanner;

public class EvenSubArray {
  public String solution(int[] A, int n){
      if(n % 2 == 0 && A[0] % 2 == 0 && A[n-1] % 2 == 0) {
        return "YES";
    }else {
        return "NO";
    }  
  }  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of the Array A:");

    int n = sc.nextInt();

    System.out.println("Enter the element of Array A:");

    int[] A = new int[n];

    for(int i=0; i<n; i++){
        A[i] = sc.nextInt();
    }
    sc.close();  
    EvenSubArray evenSubArray = new EvenSubArray();

    String res = evenSubArray.solution(A, n);
    
    System.out.print(res);
  }
}
