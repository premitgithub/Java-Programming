package Sorting;

import java.util.*;
public class Missing_no {
    public static void main(String[] args) {
        int[] arr = {2,4,3,1,5};
        System.out.println(sort(arr));
    }

    public static int sort(int[] arr) {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i && arr[i] != arr.length) {
                int temp = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = temp;
            }
        }
        for(int i=0;i< arr.length;i++) {
            if (arr[i] != i) {
                return i;
            }
        }
        return arr.length;
    }
}

