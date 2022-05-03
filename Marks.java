import java.util.Scanner;

public class Marks {

    public static void main(String[] agrc){
        Scanner obj = new Scanner(System.in);
        int input;

        do{
            System.out.println("enter marks: ");
            int marks = obj.nextInt();
            if ( marks <= 100 && marks>= 90){
                System.out.println("this is good");
                
            }
            else if (89 >= marks && marks >= 60 ){
                System.out.println("this is aslo good");
            }
            else if (0<=marks && marks <= 59 ){
                System.out.println("this is aslo good coz marks does not matters");
            }
            System.out.println("want to continue press '1' and '0' to stop");
            input = obj.nextInt();
        }while(input == 1);
    }

    
}
