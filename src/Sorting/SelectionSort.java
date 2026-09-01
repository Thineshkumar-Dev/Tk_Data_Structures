package Sorting;

import java.util.Arrays;

public class SelectionSort {
//    Repeatedly find the smallest element from the unsorted
//    part of the array and put it in the correct position.

    public static void main(String[]args){
        int []arr={54,23,1,20,11,99};
        sortTheArray1(arr);
        sortTheArray2(arr);
    }
//brute force multiple swap
    private static void sortTheArray1(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr)+"1");
//        time complexity = O(n*n);
//        Space complexity = O(1);
    }
    private static void sortTheArray2(int []arr){
        for(int i=0;i< arr.length;i++){
            int min=i;
            for (int j=i+1;j< arr.length;j++){
                if (arr[min]>arr[j]){
                    min=j;
                }
            }
            if(i!=min){
                int temp = arr[min];
                arr[min]= arr[i];
                arr[i]=temp;
            }
        }
        System.out.println(Arrays.toString(arr)+"2");
//        time complexity = O(n*n);
//        Space complexity = O(1);
    }
}
