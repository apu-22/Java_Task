package Practice_Problem3;

import java.util.Scanner;
public class Reverse_Array {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of element of series:");
        int n= scan.nextInt();

        int [] arr= new int[n];
        System.out.println("Enter the element of series:");
        for (int i=0;i<n;++i){
            arr[i]= scan.nextInt();
        }

        System.out.println("Reverse the element of series:");
        for (int i=n-1;i>=0;--i){
            System.out.print(arr[i] + " ");
        }

        scan.close();
    }
}