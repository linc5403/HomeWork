package club.banyuan.config;

import club.banyuan.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // TODO 试一试是否可以放在一起
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/blogs/create");
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/admin/**");
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/blogs/*/comments");
    }
}
