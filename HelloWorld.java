// package javaprograms;
import java.util.Scanner;


class HelloWorld {
    public static void main(String[] args) {

        System.out.println("Hello enter your +numbers"); 

        Scanner ob = new Scanner(System.in);
         int n= ob.nextInt();
        
      for(int i =1; i<=10;i++)
      {
            System.out.println( n*i);
      }
      

    }
}