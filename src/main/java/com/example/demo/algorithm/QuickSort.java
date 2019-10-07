package com.example.demo.algorithm;

public class QuickSort {
    /**
     * 先任选一个标准mid
     * 小的在标准左边，大的在标准右边
     * 递归
    **/
    public static void sort(int[] a, int start, int end){
        if(start<end) {
            int i = start;
            int j = end;
            // 基准点mid
            int mid = (start + end) / 2;
            while(i < j) {
                // 小的在标准点左边
                while (a[i] < a[mid])
                    i++;
                if (a[i] >= a[mid]) {
                    int temp = a[i];
                    a[i] = a[mid];
                    a[mid] = temp;
                    mid = i; //保证交换后基准点值不变
                }

                // 大的在标准点右边
                while (a[j] > a[mid])
                    j--;
                if (a[j] <= a[mid]) {
                    int temp = a[j];
                    a[j] = a[mid];
                    a[mid] = temp;
                    mid = j; //保证交换后基准点值不变
                }
            }

            // 递归
            sort(a, start, mid - 1);
            sort(a, mid + 1, end);
        }
    }

    public static void main(String[] agrs){
        int[] a = new int[]{10,0,3,9,5,7,6,8,2,1,4};
        QuickSort.sort(a,0,a.length-1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
