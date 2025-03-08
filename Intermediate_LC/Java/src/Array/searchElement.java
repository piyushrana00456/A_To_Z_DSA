package Java.src.Array;
import java.util.*;

public class searchElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        for(int t=0; t<testCases; t++){
            int n = sc.nextInt();
            int arr[] = new int[n];
            
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            boolean bool = false;
            for(int j=0; j<n; j++){
                if(arr[j] == k){
                    bool = true;
                    break;
                }
            }
            if(bool){
                System.out.print(1);
            }else{
                System.out.print(0);
            }
        }
    }
}