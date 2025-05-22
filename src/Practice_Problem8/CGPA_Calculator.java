package Practice_Problem8;
import java.util.Scanner;

public class CGPA_Calculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numStudent = 5;
        int numSubject = 5;

        int [] credits = new int[numSubject];
        double [][] grade = new double[numStudent][numSubject];

        System.out.println("Enter credits for the each of the 5 subjects: ");
        for (int i=0; i<numSubject; i++){
            credits[i] = scan.nextInt();
        }

        System.out.println("Enter grade point for each students: ");
        for (int i=0; i<numStudent; i++){
            for (int j=0; j<numSubject; j++){
                grade[i][j] = scan.nextDouble();
            }
        }

        System.out.println("\n CGPA results: ");
        for (int i=0; i<numStudent; i++){
            double totaltotalGradePoint = 0;
            int totalCredits = 0;
            for (int j=0; j<numSubject; j++){
                totaltotalGradePoint += grade[i][j]*credits[j];
                totalCredits += credits[j];
            }
            double cgpa = totaltotalGradePoint/totalCredits;
            System.out.println("CGPA of Student "+(i+1)+ " is: "+cgpa);
        }
        scan.close();
    }
}
