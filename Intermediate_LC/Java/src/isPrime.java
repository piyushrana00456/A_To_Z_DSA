
import java.lang.*;
import java.util.*;


public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 1) { // 1 and negative numbers are NOT prime
            System.out.println("NO");
            return;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }

}