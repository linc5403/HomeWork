package club.banyuan.day08.search;

import club.banyuan.day08.Myinterface;
import club.banyuan.day08.sort.Sort;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class QuickSearch {
    private Logger logger= LoggerFactory.getLogger(QuickSearch.class);
    @Autowired
    Sort sort;

//    public QuickSearch(Sort sort) {
//        this.sort = sort;
//    }

    public Sort getSort(){
        return sort;
    }

    @Myinterface
    public int search(int [] arr,int number){

        logger.info("Quicksearh");
        int [] afterArr=sort.quickSort(arr,0,arr.length-1);
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
