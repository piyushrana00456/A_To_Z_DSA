package Array;

import java.util.Scanner;

public class SpecialSubSequenceAG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");

        String A = sc.next();
     
        int ans = 0;
        int countA = 0;
        int n = A.length(); 
        for(int i=0; i<n; i++){
            if(A.charAt(i) == 'A'){
                countA++;
            }else if(A.charAt(i) == 'G'){
                ans += countA; 
            }
        }

        System.out.println(ans);
    }
}
