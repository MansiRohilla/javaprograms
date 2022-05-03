import java.util.Scanner;
public class leapYear {

    public static void main(String []argc){
        System.out.println("enter the year: ");
        Scanner obj = new Scanner(System.in);
        int year = obj.nextInt();

        if(year % 100 != 0)
        {
            if(year % 4 == 0){
                System.out.println("it is a leap year");
            }
            else System.out.println("it is not a leap year");
        }
        else if(year % 400 == 0)
        {
            System.out.println("it is a century leap year");
            
        }
        else
            System.out.println("it is not a leap year");
        
    }
    
}
