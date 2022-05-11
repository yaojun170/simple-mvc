package cn.yj.simple.demo.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * @Description
 * @Author yaojun
 * @Date 2021-12-15
 */
@WebFilter(urlPatterns = "/b/*",asyncSupported = true)
public class MyAnnoAsyncFilter implements Filter {
    Logger logger = Logger.getLogger("AsyncFilter");

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("--AsyncFilter init()--");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        logger.info("---AsyncFilter--before---");
        chain.doFilter(request,response);
        logger.info("---AsyncFilter--after");
    }

    @Override
    public void destroy() {

    }
}
