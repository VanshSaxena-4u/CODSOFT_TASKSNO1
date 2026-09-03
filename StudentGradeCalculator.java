import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("      CODSOFT - STUDENT GRADE CALCULATOR");
        System.out.println("========================================");

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        double totalMarks = 0;

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for Subject " + i + " (out of 100): ");
            double marks = sc.nextDouble();

            while (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Please enter marks between 0 and 100.");
                System.out.print("Enter marks again: ");
                marks = sc.nextDouble();
            }

            totalMarks += marks;
        }

        double averagePercentage = totalMarks / subjects;

        String grade;

        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else if (averagePercentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\n========================================");
        System.out.println("              RESULT");
        System.out.println("========================================");
        System.out.println("Student Name       : " + name);
        System.out.println("Total Marks        : " + totalMarks + " / " + (subjects * 100));
        System.out.printf("Average Percentage : %.2f%%%n", averagePercentage);
        System.out.println("Grade              : " + grade);
        System.out.println("========================================");

        sc.close();
    }
}