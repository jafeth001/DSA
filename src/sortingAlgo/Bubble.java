package sortingAlgo;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 5, 1, 3};
        int temp;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
}
