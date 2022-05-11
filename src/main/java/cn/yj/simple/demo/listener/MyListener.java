package cn.yj.simple.demo.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @Description
 * @Author yaojun
 * @Date 2021-12-15
 */
@WebListener
public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        System.out.println("MyListener initialized."+sce.getServletContext());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("MyListener destroyed.");
    }
}
