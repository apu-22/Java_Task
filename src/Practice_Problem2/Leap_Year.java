package Practice_Problem2;

import java.util.Scanner;
public class Leap_Year {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the year: ");
        int yr= scan.nextInt();

        if((yr % 400==0) || (yr%4==0 && yr%100 !=0))
            System.out.println(yr + " is lear year.");
        else
            System.out.println(yr + " is not leap year.");

        scan.close();
    }
}
