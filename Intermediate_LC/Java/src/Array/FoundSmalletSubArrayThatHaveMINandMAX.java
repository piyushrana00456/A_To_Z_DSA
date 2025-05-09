package Array;

import java.util.Scanner;

public class FoundSmalletSubArrayThatHaveMINandMAX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an Array A:");

        int n = sc.nextInt();

        System.out.println("Enter the elements of Array A:");

        int[] A = new int[n];

        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }
        sc.close();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            max = Math.max(max, A[i]);
            min = Math.min(min, A[i]);
        }
        int maxi = -1;
        int mini = -1;

        int ans = n;

        for(int i = n-1; i>=0; i--){
            if(A[i] == min){
                mini = i;
                if(maxi != -1){
                    int newL = maxi - mini + 1;
                    ans = Math.min(ans, newL);
                }
            }else if(A[i] == max){
                maxi = i;
                if(mini != -1){
                    int newL = mini - maxi + 1;
                    ans = Math.min(ans, newL);
                }
            }
        }
        System.out.println(ans);
    }
    
}
