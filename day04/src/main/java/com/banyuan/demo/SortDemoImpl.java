package com.banyuan.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Qualifier("quick")
@Component("university")
@Scope("prototype")
public class SortDemoImpl implements SortDemo{
    @Override
    public int [] sort(int[] numbers, int num) {
        QuickSort(numbers,0,num);
        return numbers;
    }

    private void QuickSort(int[] arr, int low, int high) {
        if(low < high)
        {
            int base = Partition(arr, low, high);
            QuickSort(arr, low, base - 1);
            QuickSort(arr, base + 1, high);
        }
    }

    public SortDemoImpl() {
    }

    @Override
    public void getSortDemo() {

    }

    private int Partition(int[] arr, int low, int high) {
        int base = arr[low];
        while(low < high)
        {
            while(low < high && arr[high] >= base)
            {
                high --;
            }
            Swap(arr, low, high);
            while(low < high && arr[low] <= base)
            {
                low ++;
            }
            Swap(arr, low, high);
        }
        return low;
    }

    private void Swap(int[] arr, int low, int high) {
        int temp;
        temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;

    }


}
