package Practice_Problem3;

import java.util.Scanner;
public class Find_Greatest_Number {
    public static void main(String[]args){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the number of values:");
        int n= scan.nextInt();
        int [] arr = new int[n];

        int greatest=arr[0];
        System.out.println("Enter the values:");
        for(int i=0;i<n;++i){
            arr[i]= scan.nextInt();
            if(arr[i]>greatest) greatest=arr[i];
        }

        System.out.print("The greatest number is: "+ greatest);
        scan.close();
    }
}