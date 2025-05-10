    class Student {
    private String name;
    private String matricNo;
    private double score;
    
    // Constructor
    public Student(String name, String matricNo, double score) {
        this.name = name;
        this.matricNo = matricNo;
        this.score = score;
    }
    
    // Method to display student info
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Matric Number: " + matricNo);
        System.out.println("Score: " + score);
    }
    
    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getMatricNo() { return matricNo; }
    public void setMatricNo(String matricNo) { this.matricNo = matricNo; }
    
    public double getScore() { return score; }
    public void setScore(double score) { this.score = score; }
}

// Working example
public class StudentInfo {
    public static void main(String[] args) {
        Student student = new Student("Rex", "2023/12345", 85.5);
        student.displayInfo();
    }
}