package Practice_Problem3;

import java.util.Scanner;
public class Prime_Num_Check {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num= scan.nextInt();
        boolean isPeime=true;

        if(num<=1) {
            isPeime=false;
        }
        else {
            for(int i=2;i<=Math.sqrt(num);++i){
                if(num % i ==0){
                    isPeime=false;
                    break;
                }

            }
        }

        if(isPeime)
            System.out.println(num + " is prime number.");
        else
            System.out.println(num + " is not prime number.");
    }
}
