package cn.yj.simple.demo.test;

import cn.yj.simple.demo.test.dto.CatDto;
import cn.yj.simple.demo.test.dto.UserDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("cn.yj.simple.demo.test.service")
public class MyConfiguration {

    @Bean
    public CatDto catDto(){
        CatDto cat = new CatDto();
        cat.setColor("yello");
        cat.setType("小黑");
        return cat;
    }

    @Bean
    public UserDto userDto(){
        UserDto userDto = new UserDto();
        userDto.setId(5);
        userDto.setName("zhangsanfenghaah");
        userDto.setAddress("wudangshan");
        return userDto;
    }
}
