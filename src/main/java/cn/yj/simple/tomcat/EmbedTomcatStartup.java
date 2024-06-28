package cn.yj.simple.tomcat;

import org.apache.catalina.startup.Tomcat;

import javax.servlet.ServletException;
import java.io.File;

public class EmbedTomcatStartup {
    public static void main(String[] args) throws Exception {
        String webappDirLocation = "src/main/webapp/";
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);

        tomcat.addWebapp("/", new File(webappDirLocation).getAbsolutePath());
        System.out.println("Configuring app with basedir: " + new File("./" + webappDirLocation).getAbsolutePath());

        tomcat.start();
        System.out.println("========tomcat=====start====>");
        tomcat.getServer().await();
    }
}
