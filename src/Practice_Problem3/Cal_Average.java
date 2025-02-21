package Practice_Problem3;

import java.util.Scanner;
public class Cal_Average {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of values:");
        int n= scan.nextInt();
        double [] arr = new double[n];
        double sum=0;

        System.out.println("Enter the values:");
        for(int i=0;i<n;++i){
            arr[i]= scan.nextDouble();
            sum+=arr[i];
        }
        double avg=sum/n;
        System.out.printf("The average of the entered values is: %.2f\n", avg);
        scan.close();
    }
}