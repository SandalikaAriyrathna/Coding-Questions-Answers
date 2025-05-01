public class PrimeCheck {
    public static void main(String[] args) {
        int num = 7;
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "Prime" : "Not Prime");
    }
}

// A prime number is a number greater than 1 that is only divisible by 1 and itself (e.g., 2, 3, 5, 7, 11...).