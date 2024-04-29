package sortingAlgo;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 5, 1, 3};
        int key;
        for (int i = 0; i < arr.length; i++) {
            key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }
}
