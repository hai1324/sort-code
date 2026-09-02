package com.mysort;

import java.util.Arrays;

public class MyQuickSort {
    public static void main(String[] args) {
        int[] arr={6,2,7,2,8,1,9,4,19,31,46};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr,int left,int right){
        int i=left;
        int j=right;
        //边界
        if(i>=j){
            return;
        }
        //记录第一个数作为基准数
        int base=arr[left];
        while(i<j){
            //从右边开始找小于基准数的,必须从右边开始，不然第一个不会交换
            while(i<j&&arr[j]>=base){
                j--;
            }
            //从左边开始找大于基准数的
            while(i<j&&arr[i]<=base){
                i++;
            }
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        //基准数归位
        int temp=arr[i];
        arr[i]=arr[left];
        arr[left]=temp;
        //递归
        quickSort(arr,left,i-1);
        quickSort(arr,i+1,right);
    }
}
