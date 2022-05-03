import java.util.Scanner;

public class Evennumber {
    public static void main(String[] argc){
        System.out.println("enter first number");
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        System.out.println("enter second number");
        int b = obj.nextInt();

    if(a == b)
    {
        System.out.println("equal");

    }
    else  if(a > b)
       
        {
            System.out.println("a is greater");
        }
       
    else
    {
            System.out.println("b is greater");
        }

    

        // if(a%2 == 0)
        // {
        //     System.out.println("it is an even number");
        // }
        // else{
        //     System.out.println("odd number");
        // }
    }

    
}
