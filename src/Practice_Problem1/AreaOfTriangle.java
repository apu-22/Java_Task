package Practice_Problem1;

import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int a= scan.nextInt();
        int b= scan.nextInt();
        int c= scan.nextInt();

        double s=(double) (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.printf("The area of triangle is: %.2f%n",area);
        scan.close();
    }

}