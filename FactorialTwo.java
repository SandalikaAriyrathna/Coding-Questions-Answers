public class FactorialTwo {
    public static void main(String[] args) {
        int num = 5;
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            // fact *= i;
            fact = fact * i; // This is the same as the above line, just written differently.
        }
        System.out.println("Factorial: " + fact);
    }
}
