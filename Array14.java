import java.util.Arrays;

class Array14 {
    public static void main(String[] args) {
        int[][] arr2D = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        // Step 1: Find total number of elements
        int totalElements = 0;
        for (int[] row : arr2D) {
            totalElements += row.length;
        }

        // Step 2: Create 1D array and copy elements
        int[] arr1D = new int[totalElements];
        int index = 0;
        for (int[] row : arr2D) {
            for (int ele : row) {
                arr1D[index++] = ele;
            }
        }

        // Step 3: Print 1D array
        System.out.println("Merged 1D Array: " + Arrays.toString(arr1D));
    }
}
