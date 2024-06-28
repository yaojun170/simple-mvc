package cn.yj.simple.demo.test;

import cn.yj.simple.demo.test.dto.UserDto;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {

    @Test
    public void testBeanRely() throws Exception{
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfiguration.class);
        UserDto userDto = (UserDto)ac.getBean("userDto");
        System.out.println(userDto.toString());
        // 注册关闭钩子
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("======>Custom shutdown hook");
            ac.close();
        }));
        Thread.sleep(10000000L);
    }
}
