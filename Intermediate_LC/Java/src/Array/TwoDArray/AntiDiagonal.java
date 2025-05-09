//Give a N * N square matrix A, return an array of its anti-diagonals. Look at the example for more details.

// Output Format

// Return a 2D integer array of size (2 * N-1) * N, representing the anti-diagonals of input array A.
// The vacant spaces in the grid should be assigned to 0.

// Input 1:
// 1 2 3
// 4 5 6
// 7 8 9

// Output 1:
// 1 0 0
// 2 4 0
// 3 5 7
// 6 8 0
// 9 0 0

package Array.TwoDArray;
import java.util.ArrayList;
import java.util.Scanner;

public class AntiDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row size of matrix A:");
        int n = sc.nextInt();

        ArrayList<ArrayList<Integer>> A = new ArrayList<>();

        for(int i=0; i<n; i++){
           ArrayList<Integer> row = new ArrayList<>();
           for(int j=0; j<n; j++){
             row.add(sc.nextInt());
           }
           A.add(row);
        }
        
        AntiDiagonalSolution antiDiagonalSolution = new AntiDiagonalSolution();

        ArrayList<ArrayList<Integer>> res = antiDiagonalSolution.diagonal(A, n);

        for(ArrayList<Integer> row : res){
            for(int val : row){
                System.out.print(val + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

class AntiDiagonalSolution{
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A, int n){
        
       int row = 2*n - 1;
       ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        
       for(int i=0; i<row; i++){
         int offset  = i < n ? 0 : i - n + 1;
          
         ArrayList<Integer> r = new ArrayList<>();
         int k = 0;
         for(int j= offset; j<= i - offset; j++){
            r.add(A.get(j).get(i -j));
            k++;
         }

         for(int j=k; j<n; j++){
            r.add(0);
         }
      
         res.add(r);
       }
        return res;
    }
}
