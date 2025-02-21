package Practice_Problem1;

import java.util.Scanner;
public class Cal_Grade {
    public static void  main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of marks:");
        int mark= scan.nextInt();

        String grade;
        if(mark>=90) grade="A+";
        else if (mark>=80) {
            grade="A";
        } else if (mark>=70) {
            grade="A-";
        } else if (mark>=60) {
            grade="B";
        } else if (mark>=40) {
            grade="C+";
        } else if (mark>=0) {
            grade="F";
        }else grade="Invalid mark";

        System.out.println("The grade is: "+ grade);

        scan.close();
    }
}
