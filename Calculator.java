import java.util.Scanner;

public class Calculator {
    public static void main(String[] arg){

        
        Scanner obj = new Scanner(System.in);
        
        int input;
        do{
            System.out.println("enter two numbers");
            int a = obj.nextInt();
            int b = obj.nextInt();
            int ans;
            System.out.println("press 1/2/3/4/5  for  finding add,sub, multiply,divide, remainder");
            int s = obj.nextInt();
        switch(s){
            case 1:{
                ans = a+b;
                System.out.println("addition is ");
                System.out.println( ans);
                break;

            }
            case 2:{
                ans = a-b;
                System.out.println("subtraction is ");
                System.out.println( ans);
                break;

            }
            case 3:{
                ans = a*b;
                System.out.println("multiply is ");
                System.out.println( ans);
                break;

            }
            case 4:{
                if(b == 0) {
                    System.out.println("Invalid Division");
                } 
                else{       
                ans = a/b;
                System.out.println("division is ");
                System.out.println( ans);
                }
                break;

            }
            case 5:{
                if(b == 0) {
                    System.out.println("Invalid Division");
                } 

               else{ ans = a%b;
                System.out.println("remainder is ");
                System.out.println( ans);
               }
            
                break;

            }
            default: System.out.println("invalid");
            
             }
             System.out.println("want to continue press '1' and '0' to stop");
            input = obj.nextInt();
    }while(input == 1);

    }
    
}
