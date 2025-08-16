import java.util.Arrays;

class ArrayEvenOdd {
    public static void main(String[] args) {
        int[] arr = {3, 6, 1, 8, 4, 7, 5, 2};
        int[] newArr = new int[arr.length];

        int index = 0;

        // Step 1: Add even numbers
        for (int ele : arr) {
            if (ele % 2 == 0) {
                newArr[index++] = ele;
            }
        }

        // Step 2: Add odd numbers
        for (int ele : arr) {
            if (ele % 2 != 0) {
                newArr[index++] = ele;
            }
        }

        // Output
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Even-Odd Separated Array: " + Arrays.toString(newArr));
    }
}
