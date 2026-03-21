
public class NumberUtils {

    // Check Prime Number
    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Check Palindrome Number
    public static boolean isPalindrome(int n) {
        int original = n;
        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        return original == reversed;
    }

    // Check Armstrong Number
    public static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        int digits = String.valueOf(n).length();

        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {

        int num = 18123;

        System.out.println("Number: " + num);
        System.out.println("Is Prime: " + isPrime(num));
        System.out.println("Is Palindrome: " + isPalindrome(num));
        System.out.println("Is Armstrong: " + isArmstrong(num));
    }
}
