package searchingAlgo;


public class Binary {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 4;
        int index = binarySearch(arr, target);
        if (index != -1)
            System.out.println("element found at index " + index);
        else
            System.out.println("element not found");
    }

    private static int binarySearch(int[] arr, int target) {
        int right = arr.length - 1;
        int left = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return-1;
}
}
