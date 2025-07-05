package BinarySearch;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 25, 30, 45};

        for(int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + ", ");
        }
    }
}
