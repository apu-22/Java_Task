package Practice_Problem4;

import java.util.Scanner;
public class String_task {
    public static void main (String[] args){
    Scanner scan= new Scanner(System.in);
    System.out.print("Enter the string: ");
    String str= scan.nextLine();

    String rev_str=new StringBuilder(str).reverse().toString();
    System.out.println("Reversed string: "+ rev_str);

    scan.close();
    }
}
