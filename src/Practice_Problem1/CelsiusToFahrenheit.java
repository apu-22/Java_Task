package Practice_Problem1;

import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the temparature in Celsiou: ");
        double celsius = scan.nextDouble();
        double fahrenheit=(celsius*9/5)+32;

        System.out.printf("%.2f Celsius is %.2f Fahrenheit.%n",celsius,fahrenheit);
        scan.close();
    }
}
