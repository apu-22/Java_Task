package Practice_Problem1;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        double area = 0.5 * base * height;
        System.out.printf("The area of the triangle is: %.2f\n", area);
        scanner.close();
    }
}
