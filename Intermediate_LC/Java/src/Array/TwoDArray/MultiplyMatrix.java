package Array.TwoDArray;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiplyMatrix {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter the rowA size of Array A:");

       int rowA = sc.nextInt();
         
       System.out.println("Enter the colA size of Array A:");

       int colA = sc.nextInt();

       ArrayList<ArrayList<Integer>> A = new ArrayList<>();

       for(int i=0; i<rowA; i++){
        ArrayList<Integer> row = new ArrayList<>();

        for(int j=0; j<colA; j++){
            row.add(sc.nextInt());
        }
        A.add(row);
       }

       System.out.println("Enter the rowB size of Array B:");

       int rowB = sc.nextInt();
         
       System.out.println("Enter the colB size of Array B:");

       int colB = sc.nextInt();

       ArrayList<ArrayList<Integer>> B = new ArrayList<>();

       for(int i=0; i<rowB; i++){
        ArrayList<Integer> row = new ArrayList<>();

        for(int j=0; j<colB; j++){
            row.add(sc.nextInt());
        }
        B.add(row);
       }

       MultiplyMatrixSolution multiplymatrixsolution = new MultiplyMatrixSolution();

       ArrayList<ArrayList<Integer>> res = multiplymatrixsolution.solve(A, rowA, colA, B, rowB, colB);

       for(ArrayList<Integer> row : res){
        for(int val: row){
           System.out.print(val+" ");  
        }
        System.out.println();
       }

    }
}

class MultiplyMatrixSolution{
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int rowA, int colA, ArrayList<ArrayList<Integer>> B, int rowB, int colB){

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
         
        for(int i=0; i<rowA; i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j=0; j<colB; j++){
                int product = 0;
                for(int k=0; k<rowA; k++){
                    product += A.get(i).get(k)*B.get(k).get(j); 
                }
                row.add(product);
            }
            res.add(row);
        }

        return res;
    }
}
