public class Calculator {
    // Add two integers
    public int add(int a, int b) {
        return a + b;
    }
    
    // Add three integers (different number of parameters)
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Add two doubles (different parameter types)
    public double add(double a, double b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 3));          // 8
        System.out.println(calc.add(5, 3, 2));      // 10
        System.out.println(calc.add(5.5, 3.2));    // 8.7
    }
}