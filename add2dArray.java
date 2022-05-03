import java.util.Scanner;

public class add2dArray {
    public static void main(String []a){

        Scanner obj = new Scanner(System.in);
       
        System.out.println("enter rows for two matrix: ");
        int r = obj.nextInt();
        System.out.println("enter column for two matrix: ");
        int c = obj.nextInt();

        int A[][] = new int[r][c];
        int B[][] = new int[r][c];
        int C[][] = new int[r][c];

        // input elements for A
        System.out.println("enter elements of matrix A: ");

        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++){

                A[i][j] = obj.nextInt();
            }
        }
            //input B elements

        System.out.println("enter elements of matrix B: ");

        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++){

                B[i][j] = obj.nextInt();
            }
        }

        // add elements to C
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        //display new array 
        System.out.println("your new matrix :");

        for(int x[]: C)
        {
            for(int m: x){

                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
    
}
