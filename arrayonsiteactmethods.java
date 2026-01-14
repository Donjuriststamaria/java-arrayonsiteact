public class Main {

    public static void main(String[] args) {
        int[] number = {10, 20, 5, 30, 15, 25, 40, 2, 8, 12};

        printNumbers(number);          // 1
        printReverse(number);          // 2
        printSum(number);              // 3
        printLessThan15(number);       // 4
        printAboveAverage(number);     // 5
    }

    // Method 1: Print numbers
    static void printNumbers(int[] number) {
        System.out.println("Numbers:");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }

    // Method 2: Print numbers in reverse
    static void printReverse(int[] number) {
        System.out.println("Numbers in Reverse:");
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }

    // Method 3: Print sum
    static void printSum(int[] number) {
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum += number[i];
        }
        System.out.println("Sum of Numbers: " + sum);
    }

    // Method 4: Print numbers less than 15
    static void printLessThan15(int[] number) {
        System.out.println("Numbers less than 15:");
        for (int i = 0; i < number.length; i++) {
            if (number[i] < 15) {
                System.out.print(number[i] + " ");
            }
        }
        System.out.println();
    }

    // Method 5: Print numbers above average
    static void printAboveAverage(int[] number) {
        System.out.println("Numbers above average (16.7):");
        for (int i = 0; i < number.length; i++) {
            if (number[i] > 16.7) {
                System.out.print(number[i] + " ");
            }
        }
        System.out.println();
    }
}