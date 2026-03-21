
public class ArrayAnalyzer {

    // Find Maximum
    public static int findMax(int[] arr) {
        int max = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Find Minimum
    public static int findMin(int[] arr) {
        int min = arr[0];

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Reverse Array
    public static void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    // Calculate Sum
    public static int findSum(int[] arr) {
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Calculate Average
    public static double findAverage(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }

    // Print Array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 5, 40, 15};

        System.out.print("Original Array: ");
        printArray(arr);

        System.out.println("Max: " + findMax(arr));
        System.out.println("Min: " + findMin(arr));
        System.out.println("Sum: " + findSum(arr));
        System.out.println("Average: " + findAverage(arr));

        reverseArray(arr);

        System.out.print("Reversed Array: ");
        printArray(arr);
    }
}
