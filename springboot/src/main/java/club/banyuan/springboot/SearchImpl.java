package club.banyuan.springboot;

import club.banyuan.spring.entity.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author 陈浩
 * @date Created on 2019/12/24
 */
@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SearchImpl implements Search {
    public Sort getBubble() {
        return bubble;
    }

    @Autowired

    private Sort bubble;


    public SearchImpl() {

    }

//    public SearchImpl(Sort bubble) {
//        this.bubble = bubble;
//    }

    @Override
    @Logging
    public int result(int[] nums, int target) {

        nums = bubble.sort(nums);
        int t = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                t++;
            }
        }
        if (t == 0) {
            return -1;
        }

        int l = 0;
        int h = nums.length - 1;
        while (l < h) {
            int m = l + (h - l) / 2;
            if (nums[m] >= target) {
                h = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

}
