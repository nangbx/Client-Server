package com.hust.soict.nang.helper;

public class SelectionSort  implements NumberSorter{
    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int min_inx = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[min_inx]) min_inx = j;
            }
            int t = arr[min_inx];
            arr[min_inx] = arr[i];
            arr[i] = t;
        }
    }
}
