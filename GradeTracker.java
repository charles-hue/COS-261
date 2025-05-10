import java.util.*;

public class GradeTracker {
    private Map<String, Student> students = new HashMap<>();

    class Student {
        String id;
        String name;
        Map<String, Double> grades = new HashMap<>();

        public Student(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public void addGrade(String course, double grade) {
            grades.put(course, grade);
        }

        public double getAverage() {
            return grades.values().stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
        }
    }

    public void addStudent(String id, String name) {
        students.put(id, new Student(id, name));
    }

    public void updateGrade(String id, String course, double grade) {
        if (students.containsKey(id)) {
            students.get(id).addGrade(course, grade);
        }
    }

    public void displayStudent(String id) {
        Student s = students.get(id);
        System.out.println("Student: " + s.name);
        s.grades.forEach((course, grade) -> 
            System.out.println(course + ": " + grade));
        System.out.println("Average: " + s.getAverage());
    }

    public static void main(String[] args) {
        GradeTracker tracker = new GradeTracker();
        tracker.addStudent("S001", "Alice");
        tracker.updateGrade("S001", "Math", 90.5);
        tracker.updateGrade("S001", "Science", 85.0);
        tracker.displayStudent("S001");
    }
}
