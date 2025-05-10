// Base class
    class Person {
    protected String name;
    protected int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void introduce() {
        System.out.println("Hello, I'm " + name + " and I'm " + age + " years old.");
    }
}

// Subclass
    class Teacher extends Person {
    private String subject;
    
    public Teacher(String name, int age, String subject) {
        super(name, age);  // Call parent constructor
        this.subject = subject;
    }
    
    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I teach " + subject + ".");
    }
    
    public void teach() {
        System.out.println("Teaching " + subject + "...");
    }
}

// Usage example:
public class BaseClassAndSubclass {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mrs. Smith", 42, "Mathematics");
        teacher.introduce();
        teacher.teach();
    }
}
