import java.util.Random;
import java.util.Scanner;

public class rockPaperGame {

    public static void main(String []argc)
    {
        Scanner obj = new Scanner(System.in);
        Random num = new Random();
        int upperbound = 3;
        int system = num.nextInt(upperbound);
        // System.out.println("random value from 0 to "+ (upperbound-1)+ " : " + system);
        System.out.println("press 0\\1\\2 for rock, paper, scissor");
        int user = obj.nextInt();
        String name;
        String n;
        switch(system){
            case 0 ->{ name ="rock";
                    System.out.println("opponent choose: " + name);
                    }
            case 1 ->{ name ="paper";
                    System.out.println("opponent choose: " + name);
                }
            case 2 ->{ name ="sicssor";
                    System.out.println("opponent choose: " + name);
                    }
        }
        switch(user){
            case 0 ->{ n ="rock";
                    System.out.println("user choose: " + n);
                    }
            case 1 ->{ n ="paper";
                    System.out.println("user choose: " + n);
                }
            case 2 ->{ n ="sicssor";
                    System.out.println("user choose: " + n);
                    }
        }
        
        
        if((system == 1 && user == 0 )||(system == 0 && user == 2)||(system == 2 && user == 1)){
           
            System.out.println("opponent win!!!!" );
        }
         else if ((system == 1 && user == 2)||(system == 0 && user == 1)||(system == 2 && user == 0)){
           
            System.out.println("you win!!!!" );
        }
        else {
           
            System.out.println("its a tie" );
        }
        

       
    }
    
}
