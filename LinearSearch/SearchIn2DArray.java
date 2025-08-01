package LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12},
        };
        int target = 34;
        int[] ans = search(arr, target);
        System.out.println("The element found in 2D array at Index" + Arrays.toString(ans));

        System.out.println("Maximum element in the Array is: " + max(arr));
    }

    static int[] search(int[][] arr, int target) {
        for(int row =0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int max(int[][] arr) {
    int max = Integer.MIN_VALUE;
        for(int[] row: arr) {
            for(int col : row) {
                if(col > max) {
                    max = col;
                }
            }
        }
        return max;
    }
}
