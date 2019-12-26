package club.banyuan.springboot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 陈浩
 * @date Created on 2019/12/24
 */
class BubbleSortImplTest {

    @Test
    void sort() {
        Sort sort1=new BubbleSortImpl();
        assertArrayEquals(sort1.sort(new int[]{12,1,3,4}),new int[]{1,3,4,12} );
    }
}