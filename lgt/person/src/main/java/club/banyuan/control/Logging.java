package club.banyuan.control;

import org.springframework.stereotype.Service;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created on 2019/12/26 4:24 下午
 *
 * @author lgt
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Service
public @interface Logging {
}
