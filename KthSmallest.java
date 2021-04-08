package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class KthSmallest {
    public static int kthSmallest(Integer[] arr, int k ){
        Arrays.sort(arr);

        return arr[k-1];
    }

    public static void main(String[] args) {
        Integer arr[] = new Integer[] {12, 3,4,5,6,19};
        int k = 2;
        System.out.println("K'th smallest element is "+kthSmallest(arr, k));
    }
}
