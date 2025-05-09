
import java.util.Scanner;

public class isSquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =1; i*i <= n; i++) {
            if(i*i == n){
                System.out.print(i);
                return;
            }    
        }
        System.out.print(-1);
    }
}
