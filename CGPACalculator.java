import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numCourses;
        double totalPoints = 0;
        int totalUnits = 0;

        System.out.print("Enter number of courses: ");
        numCourses = input.nextInt();

        for (int i = 1; i <= numCourses; i++) {
            System.out.println("\nCourse " + i);
            System.out.print("Enter score: ");
            int score = input.nextInt();

            System.out.print("Enter course unit: ");
            int unit = input.nextInt();

            int gradePoint = 0;
            String grade = "";

            if (score >= 70) {
                gradePoint = 5;
                grade = "A";
            } else if (score >= 60) {
                gradePoint = 4;
                grade = "B";
            } else if (score >= 50) {
                gradePoint = 3;
                grade = "C";
            } else if (score >= 45) {
                gradePoint = 2;
                grade = "D";
            } else if (score >= 40) {
                gradePoint = 1;
                grade = "E";
            } else {
                gradePoint = 0;
                grade = "F";
            }

            System.out.println("Grade: " + grade + " | Grade Point: " + gradePoint);

            totalPoints += gradePoint * unit;
            totalUnits += unit;
        }

        double cgpa = totalPoints / totalUnits;
        System.out.printf("\nYour CGPA is: %.2f\n", cgpa);
        
                // Determine CGPA classification using if-else
        System.out.print("CGPA Classification: ");
        if (cgpa >= 3.7) {
            System.out.println("First Class Honours");
        } else if (cgpa >= 3.3) {
            System.out.println("Second Class Honours (Upper Division)");
        } else if (cgpa >= 3.0) {
            System.out.println("Second Class Honours (Lower Division)");
        } else if (cgpa >= 2.0) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        
    }
}