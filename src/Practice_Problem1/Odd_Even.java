package Practice_Problem1;

import java.util.Scanner;
public class Odd_Even {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number:");
        int num= scan.nextInt();
        if(num%2==0) System.out.print("The number is Even");
        else System.out.print("The number is Odd");

        scan.close();
    }
}
