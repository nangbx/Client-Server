package com.hust.soict.nang.helper;

public class InsertionSort implements NumberSorter{
    @Override
    public void sort(int[] arr) {

        int n = arr.length;

        for(int i = 1; i < n; i++){
            int t = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > t){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = t;
        }
    }
}
