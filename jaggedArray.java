import java.util.Scanner;

public class jaggedArray {

    public static void main(String argc[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row size: ");
        int n = sc.nextInt();

        int sample[][] = new int[n][];
        
        sample[0] = new int[3];
        sample[1] = new int[5];
        sample[2] = new int[2];

        for(int i=0; i<sample.length; i++)
        {
            for(int j = 0; j< sample[i].length; j++)
            {
                sample[i][j] = sc.nextInt();
            }
        }

        for(int a[]: sample)
        {
            for(int b : a){
                 System.out.print(b+" ");
            }
            System.out.println();

        }
       

    }
    
}
