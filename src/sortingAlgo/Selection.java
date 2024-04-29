package sortingAlgo;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 5, 1, 3};
        int temp;
        int minIndex;

        for (int i=0;i<arr.length-1;i++){
            minIndex=i;
            for (int j=i+1;j< arr.length-1;j++){
                if (arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }
            temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
        for (int i:arr){
            System.out.print(i+" ");
        }
    }

}
