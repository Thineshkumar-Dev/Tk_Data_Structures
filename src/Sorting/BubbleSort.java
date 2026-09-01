package Sorting;

import java.util.Arrays;

public class BubbleSort {
//    Repeatedly compare two adjacent elements and
//    swap them if they are in the wrong order.
//Compare neighbors → swap repeatedly.
    public static void main(String[]args){
        int []arr={54,23,1,20,11,99};
        sortTheArray1(arr);
        sortTheArray2(arr);
    }

    private static void sortTheArray2(int[] arr) {
        for (int i=0;i<arr.length;i++){
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr)+"1");
        //        time complexity = O(n*n);
        //        Space complexity = O(1);
    }

    // avoid the swap if it is aldready swappoed
    private static void sortTheArray1(int[] arr) {
        for (int i=0;i<arr.length;i++){
            boolean swap=false;
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swap=true;
                }
            }
            if(!swap)
                break;
        }
        System.out.println(Arrays.toString(arr)+"2");
    }
}
