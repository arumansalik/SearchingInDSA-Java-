package LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {10, 30, 40, 50, 60, 70, 80, 90};
        int target = 50;
        int ans  = linearSearch(nums, target);
        System.out.println("Element " + target + " found at index: " + ans);
        int ans1  = linearSearch1(nums, target);
        System.out.println("Element " + target + " found at index: " + ans1);
     }

    static int linearSearch(int arr[], int target) {
        if(arr.length == 0) {
            return -1;
        }
        for(int i=0; i< arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static int linearSearch1(int arr[], int target) { // using the enhanced for loop
        if(arr.length == 0) {
            return -1;
        }
        for(int element : arr) {
            if(element == target) {
                return element;
            }
        }
        return -1;
    }
}
