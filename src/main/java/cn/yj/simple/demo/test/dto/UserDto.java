package cn.yj.simple.demo.test.dto;

import lombok.Data;
import org.springframework.beans.factory.DisposableBean;

@Data
public class UserDto implements DisposableBean {
    private int id;
    private String name;
    private String address;


    @Override
    public void destroy() throws Exception {
//        Thread.sleep(3000);
        System.out.println("---->UserDto.destory--->");
    }
}
