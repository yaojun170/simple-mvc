package cn.yj.simple.demo.initi;

import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * @Description
 * @Author yaojun
 * @Date 2021-12-20
 */
public class MyTestInitizlize implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        System.out.println("--MyTestInitizlize--WebApplicationInitializer onStartup--");
    }
}
