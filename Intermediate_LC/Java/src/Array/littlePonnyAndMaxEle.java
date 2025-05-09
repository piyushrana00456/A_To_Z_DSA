//Given an array, A, of N integers, In a particular operation we can set any element of the array equal to -1.
// wants to find max number of operations required such that max element of the resulting array is B.

package Array;
import java.util.*;

public class littlePonnyAndMaxEle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int b = sc.nextInt();
        
        int count = 0;
        boolean bool = false;
        for(int i=0; i<n; i++){
            if(arr[i] > b){
                count++;
            }
            if(arr[i] == b) bool = true;
        }

        if(count > 0 && bool){
            System.out.print(count);
        }else{
            System.out.print(-1);
        }

    }
}