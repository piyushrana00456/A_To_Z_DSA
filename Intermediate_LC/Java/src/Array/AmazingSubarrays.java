package Array;
import java.util.*;

public class AmazingSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string");

        String str = sc.next();

        int count = 0;
        int n = str.length();
        final int MOD = 10003; 
        
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
         
        for (int i = 0; i < n; i++) {
            if (vowels.contains(str.charAt(i))) {
                count = (count + (n - i)) % MOD;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
