package cn.yj.simple.demo.servlet.async;

import cn.yj.simple.dto.Member;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

/**
 * @Description
 * @Author yaojun
 * @Date 2022-01-06
 */
@WebServlet(asyncSupported = true, urlPatterns = "/b/asyncservlet")
public class AsyncServlet extends HttpServlet {
    Logger logger = Logger.getLogger("AsyncServlet");

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("[AsyncServlet doGet ]start");
        long s1 = System.currentTimeMillis();

        AsyncContext asyncContext = req.startAsync();
        asyncContext.setTimeout(5000);
        asyncContext.addListener(new AsyncListener() {
            @Override
            public void onComplete(AsyncEvent event) throws IOException {
                logger.info("===onComplete=");
            }

            @Override
            public void onTimeout(AsyncEvent event) throws IOException {
                logger.info("===onTimeout=");
                ServletResponse response = event.getAsyncContext().getResponse();
                PrintWriter out = response.getWriter();
                out.write("AsyncServlet TimeOut Error in Processing");
            }

            @Override
            public void onError(AsyncEvent event) throws IOException {
                logger.info("===onError=");
            }

            @Override
            public void onStartAsync(AsyncEvent event) throws IOException {
                logger.info("===onStartAsync=");
            }
        });
        new Thread(()->{
            try {
                doSomething(asyncContext);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

        logger.info("[AsyncServlet doGet] end,ct="+(System.currentTimeMillis()-s1));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("[AsyncServlet doPost]");
    }

    private void doSomething(AsyncContext asyncContext) throws IOException {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("---"+asyncContext.getRequest().getParameter("abc"));

        Member member = new Member("wanglihong","America",42);
        asyncContext.getResponse().getWriter().print("AsyncServlet response:"+member);
        logger.info("--[AsyncServlet doSomething end]--");
        asyncContext.complete();

    }
}
