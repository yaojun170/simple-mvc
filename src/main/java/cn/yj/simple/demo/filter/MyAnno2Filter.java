package cn.yj.simple.demo.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @Description
 * @Author yaojun
 * @Date 2021-12-15
 */
@WebFilter("/a/*")
public class MyAnno2Filter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("--MyAnno2Filter init()--");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("---MyAnno2Filter--before---");
        chain.doFilter(request,response);
        System.out.println("---MyAnno2Filter--after");
    }

    @Override
    public void destroy() {

    }
}
