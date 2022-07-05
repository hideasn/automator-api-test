package com.hide.javainterfaceproject.test;
import java.util.Arrays;

/**
 * @program: java-interface-project
 * @ClassName: BubbleSort
 * @description:
 * @author: HideAsn
 * @create: 2022-06-19
 */
public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {12, 56, 35, 27, 100};
        System.out.println("排序前:"+Arrays.toString(arr));
        for (int i=0; i< arr.length-1; i++) {
            for (int x=0; x< arr.length-1-i; x++) {
                if (arr[x] > arr[x+1]) {
                    int temp = arr[x];
                    arr[x] = arr[x+1];
                    arr[x+1] = temp;
                }
            }
        }
        System.out.println("排序后:"+Arrays.toString(arr));
    }
}
