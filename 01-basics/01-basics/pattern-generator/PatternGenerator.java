
public class PatternGenerator {

    public static void printPyramid(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void printInvertedPyramid(int n) {
        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void printDiamond(int n) {
        printPyramid(n);
        printInvertedPyramid(n - 1);
    }

    public static void main(String[] args) {

        int n = 5;

        System.out.println("Pyramid:");
        printPyramid(n);

        System.out.println("\nInverted Pyramid:");
        printInvertedPyramid(n);

        System.out.println("\nDiamond:");
        printDiamond(n);
    }
}
