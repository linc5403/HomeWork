package club.banyuan.interceptor;

import club.banyuan.bean.User;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CommentInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        // 将comment的content放到session中
        Object content = request.getSession().getAttribute("content");
        if (content == null) {
            System.out.println("content is null");
            content = request.getParameter("content");
            request.getSession().setAttribute("content", content);
        }
        System.out.println("contentInterceptor get param: " + content);
        return true;
    }
}
