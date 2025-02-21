package Practice_Problem1;

import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for arm length
        System.out.print("Enter the arm length of the equilateral triangle: ");
        double arm = scanner.nextDouble();

        // Calculate area
        double area = (Math.sqrt(3) / 4) * Math.pow(arm, 2);

        // Display result
        System.out.printf("The area of the equilateral triangle is: %.2f\n", area);

        scanner.close();
    }
}
