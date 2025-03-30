public class LastDigitChecker {

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {

        if (!isValid(a) || !isValid(b) || !isValid(c)) {
            return false;
        }

        int lastA = a % 10;   // Get the last digit of 'a'
        int lastB = b % 10;   // Get the last digit of 'b'
        int lastC = c % 10;   // Get the last digit of 'c'

        return (lastA == lastB) || (lastA == lastC) || (lastB == lastC);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("Test cases:");
        System.out.println("hasSameLastDigit(41, 22, 71): " + hasSameLastDigit(41, 22, 71));  // true (shared last digit: 1)
        System.out.println("hasSameLastDigit(23, 32, 42): " + hasSameLastDigit(23, 32, 42));  // false (no shared last digit)
        System.out.println("hasSameLastDigit(10, 1000, 20): " + hasSameLastDigit(10, 1000, 20));  // true (shared: 0)
        System.out.println("hasSameLastDigit(21, 31, 41): " + hasSameLastDigit(21, 31, 41));  // true (shared: 1)
        System.out.println("hasSameLastDigit(35, 45, 55): " + hasSameLastDigit(35, 45, 55));  // true (shared: 5)
        System.out.println("hasSameLastDigit(99, 88, 77): " + hasSameLastDigit(99, 88, 77));  // false (no shared digit)
        System.out.println("hasSameLastDigit(12, 101, 1000): " + hasSameLastDigit(12, 101, 1000));  // false (101 is invalid)
    }
}
