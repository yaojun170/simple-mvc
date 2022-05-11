package cn.yj.simple.demo.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * @Description
 * @Author yaojun
 * @Date 2021-12-14
 */
public class CustomServlet extends HttpServlet {
    Logger logger = Logger.getLogger("CustomServlet");

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("--CustomServlet doGet--"+req.getServletPath());
        long s1 = System.currentTimeMillis();

        /*new Thread(()->{
            try {
                doSomething(req,resp);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();*/
        logger.info("[CustomServlet doGet] end,costTime="+(System.currentTimeMillis()-s1));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("--CustomServlet doPost--"+req.getServletPath());
        resp.getWriter().print("hello servlet post");
    }

    private void doSomething(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("-CustomServlet dosomething end--");
        resp.getWriter().print("hello servlet get222222");
    }
}
