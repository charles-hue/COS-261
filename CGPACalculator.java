import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("CGPA Calculator");
        System.out.println("---------------");
        
        // Input number of courses
        System.out.print("Enter the number of courses: ");
        int numCourses = scanner.nextInt();
        
        double totalGradePoints = 0;
        int totalCredits = 0;
        
        // Process each course
        for (int i = 1; i <= numCourses; i++) {
            System.out.println("\nCourse " + i + ":");
            System.out.print("Enter credit hours for this course: ");
            int credits = scanner.nextInt();
            
            System.out.print("Enter marks obtained (0-100): ");
            double marks = scanner.nextDouble();
            
            // Determine grade point based on marks using if-else
            double gradePoint;
            if (marks >= 90) {
                gradePoint = 4.0;
                System.out.println("Grade: A, Grade Point: 4.0");
            } else if (marks >= 85) {
                gradePoint = 3.7;
                System.out.println("Grade: A-, Grade Point: 3.7");
            } else if (marks >= 80) {
                gradePoint = 3.3;
                System.out.println("Grade: B+, Grade Point: 3.3");
            } else if (marks >= 75) {
                gradePoint = 3.0;
                System.out.println("Grade: B, Grade Point: 3.0");
            } else if (marks >= 70) {
                gradePoint = 2.7;
                System.out.println("Grade: B-, Grade Point: 2.7");
            } else if (marks >= 65) {
                gradePoint = 2.3;
                System.out.println("Grade: C+, Grade Point: 2.3");
            } else if (marks >= 60) {
                gradePoint = 2.0;
                System.out.println("Grade: C, Grade Point: 2.0");
            } else if (marks >= 55) {
                gradePoint = 1.7;
                System.out.println("Grade: C-, Grade Point: 1.7");
            } else if (marks >= 50) {
                gradePoint = 1.3;
                System.out.println("Grade: D+, Grade Point: 1.3");
            } else if (marks >= 45) {
                gradePoint = 1.0;
                System.out.println("Grade: D, Grade Point: 1.0");
            } else {
                gradePoint = 0.0;
                System.out.println("Grade: F, Grade Point: 0.0");
            }
            
            // Calculate quality points for this course (grade point * credits)
            double qualityPoints = gradePoint * credits;
            totalGradePoints += qualityPoints;
            totalCredits += credits;
        }
        
        // Calculate CGPA
        double cgpa = totalGradePoints / totalCredits;
        
        System.out.println("\nCalculation Results:");
        System.out.println("Total Quality Points: " + totalGradePoints);
        System.out.println("Total Credit Hours: " + totalCredits);
        System.out.printf("Your CGPA is: %.2f\n", cgpa);
        
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
        
        scanner.close();
    }
}