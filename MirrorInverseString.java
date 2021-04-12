package com.company;

public class MirrorInverseString {
    static boolean isMirrorInverse(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[arr[i]] != i)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        if (isMirrorInverse(arr))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
