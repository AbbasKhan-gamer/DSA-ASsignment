// Name: Muhammad Abbas Babar Khan
// Roll Number: CSE/89/2K24

public class RecursiveSum {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = recursiveSum(array, array.length);
        System.out.println("Sum of array elements: " + sum);
    }

    public static int recursiveSum(int[] array, int n) {
        if (n <= 0) {
            return 0;
        }
        return recursiveSum(array, n - 1) + array[n - 1];
    }
}
