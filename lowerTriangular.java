import java.util.Scanner;
public class lowerTriangular {
    public static void main(String []argc)
    {
        System.out.println("enter the size of matrix");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int arr[][]= new int[n][];

        for(int i =0; i<n; i++)
        {
            arr[i] = new int[i+1];
            arr[i] = obj.nextInt();
        }
    }
    
}
