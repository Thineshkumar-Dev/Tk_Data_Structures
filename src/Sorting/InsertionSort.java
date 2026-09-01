package Sorting;

public class InsertionSort {
    public static void main(String[]args){
        int []arr={54,23,1,20,11,99};
        sortTheArray1(arr);
        sortTheArray2(arr);
    }

    private static void sortTheArray2(int[] arr) {
        for (int i=0;i< arr.length;i++){
            int j=i;
            while (j>0 && arr[j-1]>arr[j]){
//                swap
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
            }
        }
        // Time Complexity: O(n²)
        // Space Complexity: O(1)
    }

    private static void sortTheArray1(int[] arr) {

    }
}
