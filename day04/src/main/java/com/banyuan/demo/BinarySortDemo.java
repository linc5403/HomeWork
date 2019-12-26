package com.banyuan.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySortDemo {
    @Qualifier("quick")
    @Autowired
    private SortDemo sortDemo;

    public SortDemo getSortDemo() {
        return sortDemo;
    }

    public void setSortDemo(SortDemo sortDemo) {
        this.sortDemo = sortDemo;
    }

    public SortDemo getSortDemo(SortDemo sortDemo) {
        return this.sortDemo=sortDemo;
    }

public int[] sort(int []cd,int number){
    int[] sort = sortDemo.sort(cd, number);
    return sort;
}
}
