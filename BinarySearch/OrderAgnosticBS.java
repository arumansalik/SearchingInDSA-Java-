package BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {45, 30, 25, 22, 18, 16, 15, 4, 3, 2, 0, -4, -12, -18};
        int target = 22;
        int ans = orderAgnostic(arr, target);
        System.out.println(ans);
    }

    static int orderAgnostic(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        //find whether the array is sorted in ascending or descending
        boolean isAsc = arr[low] < arr[high];


        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(arr[mid] == target) {
                return mid;
            }

            if(isAsc) {
                if (target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }


        }
        return -1;
    }
}
