//Given an Integer N, need to print all the Armstrong Numbers b/w 1 to N;
//if sum of each digit of number is equal to the number itself is Armstrong number

package Java.src;

import java.util.Scanner;

public class isArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int armNum = i;
            int sum = 0;
            while (armNum > 0) {
                int digit = armNum % 10;
                sum += Math.pow(digit, 3);
                armNum = armNum / 10;
            }

            if (sum == i) {
                System.out.println(i);
            } 
        }

    }
}
