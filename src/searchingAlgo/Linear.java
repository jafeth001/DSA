package searchingAlgo;

public class Linear {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 5;
        int index = linearSearch(arr, target);
        if (index != -1)
            System.out.println("element found at index " + index);
        else
            System.out.println("element not found");
    }

    private static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                return i;
            }

        }
        return -1;
    }

}
