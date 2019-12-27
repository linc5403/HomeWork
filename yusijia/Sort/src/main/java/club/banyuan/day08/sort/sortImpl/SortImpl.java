package club.banyuan.day08.sort.sortImpl;

import club.banyuan.day08.sort.Sort;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class SortImpl implements Sort {
    @Override
    public int[] quickSort(int[] arr,int begin,int end) {
        int i = begin;
        int j = arr.length-1;
        if(begin<end) {
            i=begin+1;
            while (i < j) {
                if (arr[i] > arr[begin]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j--;
                } else {
                    i++;
                }
            }
            if (arr[i] >= arr[begin]) {
                i--;
            }
            int temp = arr[i];
            arr[i] = arr[begin];
            arr[begin] = temp;
            quickSort(arr, begin, i-1);
            quickSort(arr, i+1, end);
        }
        return arr;
    }

    @Override
    public int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        return arr;
    }
}
