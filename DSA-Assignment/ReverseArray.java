// Name: Muhammad Abbas Babar Khan
// Roll Number: CSE/89/2k24

import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Original Array:");
        printArray(array);

        int[] reversedArray = reverseArray(array);
        System.out.println("Reversed Array:");
        printArray(reversedArray);
    }

    public static int[] reverseArray(int[] array) {
        Stack<Integer> stack = new Stack<>();
        for (int num : array) {
            stack.push(num);
        }

        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = stack.pop();
        }
        return reversedArray;
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
