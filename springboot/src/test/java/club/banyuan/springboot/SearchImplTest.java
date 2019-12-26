package club.banyuan.springboot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 陈浩
 * @date Created on 2019/12/24
 */
class SearchImplTest {

    @Test
    void result() {
        Search search=new SearchImpl() ;
        System.out.println( search.result(new int[]{1,2,4,5,7},4));
    }
}