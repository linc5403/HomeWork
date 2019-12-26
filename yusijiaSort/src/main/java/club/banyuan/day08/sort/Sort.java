package club.banyuan.day08.sort;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public interface Sort {
   int [] quickSort(int [] arr,int begin,int end);
   int [] bubbleSort(int [] arr);
}
