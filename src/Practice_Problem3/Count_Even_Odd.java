package Practice_Problem3;

import java.util.Scanner;
public class Count_Even_Odd {
    public static void main(String[]args){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the number of element of series:");
        int n= scan.nextInt();

        int [] arr= new int[n];
        int E_count=0,O_count=0;
        System.out.println("Enter the element of series:");
        for (int i=0;i<n;++i){
            arr[i]= scan.nextInt();
            if(arr[i]%2==0) E_count++;
            else O_count++;
        }

        System.out.println("The total even number is: "+E_count);
        System.out.println("The total odd number is: "+O_count);

        scan.close();
    }
}