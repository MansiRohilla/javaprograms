
import java.util.Scanner;

public class percentage {

    public static void main(String []argc){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks out of: ");
        int n = sc.nextInt();
        System.out.println("enter the total no. of subject");
        int subj = sc.nextInt();
        float sum=0;
        for(int i= 1; i<=subj; i++)
        {
            System.out.println("enter marks obtained in subject:" +i);
            int marks = sc.nextInt();
            sum = sum + marks;
        }
        System.out.println(sum);
        float total = n*subj;
        System.out.println(total);
        double percent =(sum*100/total);
        System.out.println("you scored "+percent+" % take a chill pill");


    }
    
}
