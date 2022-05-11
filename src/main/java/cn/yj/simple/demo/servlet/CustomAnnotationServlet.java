package cn.yj.simple.demo.servlet;

import cn.yj.simple.dto.Member;

import javax.servlet.AsyncContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * @Description
 * @Author yaojun
 * @Date 2021-12-14
 */
@WebServlet(urlPatterns = "/a/CustomAnnotationServlet",loadOnStartup = 1)
public class CustomAnnotationServlet extends HttpServlet {
    Logger logger = Logger.getLogger("AsyncServlet");
    @Override
    public void init(ServletConfig config) throws ServletException {

        logger.info("---CustomAnnotationServlet init----classLoader:"+config.getClass().getClassLoader());

        logger.info("");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("--CustomAnnotationServlet doGet--"+req.getServletPath());
        logger.info("====req classLoader="+req.getClass().getClassLoader());
//        resp.sendError(405, "testError hehah");
        Member member = new Member("xiaowangba","shenzhen",27);
        logger.info("member classLoader="+member.getClass().getClassLoader());
        resp.getWriter().print("hello CustomAnnotationServlet get"+member);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("--CustomAnnotationServlet doPost--"+req.getServletPath());
        HttpSession session = req.getSession();
        Object tkey = session.getAttribute("tkey");
        resp.getWriter().print("hello CustomAnnotationServlet post");
    }
}
