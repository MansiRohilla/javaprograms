import java.util.Scanner;

public class array {
    public static void main(String []argc){

        System.out.println("enter size of array");
        Scanner obj = new Scanner(System.in); // object creat for input
        int n = obj.nextInt(); 
        int a[][] = new int[n][n]; //2d insilazation

        System.out.println("enter element of array");

        for(int i=0; i<n; i++)
        { // nested for loop for array input
            for(int j=0; j<n; j++)
            a[i][j] = obj.nextInt();
        }
     System.out.println("array: ");
        //nested for each loop for display array
        for(int r[] : a)
        {
            for(int c : r){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
    
}









