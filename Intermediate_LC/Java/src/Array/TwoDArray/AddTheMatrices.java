package Array.TwoDArray;
import java.util.ArrayList;
import java.util.Scanner;

public class AddTheMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for testcase:");
        int t = sc.nextInt();

        while(t-- > 0){
            System.out.println("Enter row size of Array A:");
            int rowA = sc.nextInt();
            System.out.println("Enter col size of Array A:");
            int colA = sc.nextInt();

            ArrayList<ArrayList<Integer>> A = new ArrayList<>();

            for(int i=0; i<rowA; i++){
                ArrayList<Integer> row = new ArrayList<>();
                for(int j=0; j<colA; j++){
                    row.add(sc.nextInt());
                }
                A.add(row);
            }
            System.out.println("Enter row size of Array B:");

            int rowB = sc.nextInt();

            System.out.println("Enter row size of Array B:");

            int colB = sc.nextInt();

            ArrayList<ArrayList<Integer>> B = new ArrayList<>();

            for(int i=0; i<rowB; i++){
                ArrayList<Integer> row = new ArrayList<>();
                for(int j=0; j<colB; j++){
                    row.add(sc.nextInt());
                }
                B.add(row);
            }

            Solution solution = new Solution();

            ArrayList<ArrayList<Integer>> result = solution.solve(A, B);

            for(ArrayList<Integer> row : result){
                for(int val : row){
                    System.out.print(val + " ");
                }
                System.out.println();
            }
             
        }
        sc.close();
    }
}


class Solution{
  public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B){
       int rowA = A.size();
       int colA = A.get(0).size();
       
       ArrayList<ArrayList<Integer>> res = new ArrayList<>();
         
       for(int i=0; i< rowA; i++){
          ArrayList<Integer> row = new ArrayList<>();
          for(int j=0; j<colA; j++){
            int sum = A.get(i).get(j) + B.get(i).get(j);

            row.add(sum);
          }
          res.add(row);
       }
       return res;
   } 
}