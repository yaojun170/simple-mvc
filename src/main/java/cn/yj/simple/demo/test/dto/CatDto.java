package cn.yj.simple.demo.test.dto;

import lombok.Data;
import org.springframework.beans.factory.DisposableBean;

@Data
public class CatDto implements DisposableBean {
    private String type;
    private String color;

    @Override
    public void destroy() throws Exception {
        System.out.println("----->CatDto.destroy--->");
    }
}
