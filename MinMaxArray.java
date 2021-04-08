package com.company;

class MinMaxArray {
    static class Pair{
        int min;
        int max;
    }

    static Pair getMinMax(int arr[], int n){
        Pair minmax = new Pair();
        int i;

        if(n==1){
            minmax.max = arr[0];
            minmax.min = arr[0];
            return minmax;
        }
        if (arr[0] > arr[1]){
            minmax.max = arr[0];
            minmax.min = arr[1];

        }
        else{
            minmax.max=arr[1];
            minmax.min=arr[0];
        }

        for (i=2;i<n;i++){
            if (arr[i]>minmax.max){
                minmax.max=arr[i];
            }
            else if(arr[i]<minmax.min){
                minmax.min=arr[i];
            }

        }
        return minmax;

    }

    public static void main(String args[]) {
        int arr[] = {1000,20,399,1,2034};
        int arr_size = 5;
        Pair minmax = getMinMax(arr, arr_size);
        System.out.printf("\nMinimum element in array is :%d", minmax.min);
        System.out.printf("\nMaximum element in array is :%d", minmax.max);

    }

}
