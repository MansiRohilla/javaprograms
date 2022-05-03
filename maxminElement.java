import java.util.Scanner;
public class maxminElement {
    public static void main(String []argc)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the size of array");

        //size of array 

        int n = obj.nextInt();
        int arr[] = new int[n];

        //input array

        for(int i=0; i<n; i++)
        {
            arr[i] = obj.nextInt();
        }

        //display array using foreach loop

        for(int element: arr){

            System.out.print(element+" ");
        }

        System.out.println();

        //find max 

        int max = 0;
        for(int element: arr)
        {
            if(element > max){
                max = element;
            }
        }
        System.out.println("max element in array: "+ max);

        //minimum

        int min = arr[0];
        for(int element: arr){

            if(element < min){
                min = element;
            }
        }
        System.out.println("min element in array: "+ min);
        
        
        
    }
    
}
