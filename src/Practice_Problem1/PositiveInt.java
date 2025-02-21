package Practice_Problem1;

//import java.awt.*;
import java.util.Scanner;

public class PositiveInt {
    public static void main(String [] args){
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter a number:");

        if(scan.hasNextInt()){
            int number = scan.nextInt();
            if(number>0){
                System.out.print("The number is positive integer");
            }
            else
                System.out.print("The number is not positive integer");
        }
        else
            System.out.print("The number is not integer");

        scan.close();
    }
}