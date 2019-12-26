package club.banyuan.day08.search;

import club.banyuan.day08.sort.Sort;
import club.banyuan.day08.sort.sortImpl.SortImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BubbleSearch {
    @Autowired
    Sort sort;

//    public BubbleSearch(Sort sort) {
//        this.sort = sort;
//    }
    public Sort getSort(){
        return sort;
    }

    public int search(int [] arr,int number){
        System.out.println("bubble");
        int [] afterArr=sort.bubbleSort(arr);
        int index=0;
        for (int i = 0; i <afterArr.length ; i++) {
            index++;
            if(number==afterArr[i]){
                return index;
            }
        }
        return index;
    }
}
