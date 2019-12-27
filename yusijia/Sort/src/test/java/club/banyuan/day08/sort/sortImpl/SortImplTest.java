package club.banyuan.day08.sort.sortImpl;

import club.banyuan.day08.sort.Sort;

import static org.junit.Assert.*;

public class SortImplTest {

    @org.junit.Test
    public void quickSort() {
        Sort sort=new SortImpl();
        int [] arr=sort.quickSort(new int[]{4,3,6,2},0,3);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }

    @org.junit.Test
    public void bubbleSort() {
        Sort sort=new SortImpl();
        int [] arr=sort.bubbleSort(new int[]{4,3,6,2});
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}