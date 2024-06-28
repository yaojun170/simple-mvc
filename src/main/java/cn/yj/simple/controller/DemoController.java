package cn.yj.simple.controller;

import cn.yj.simple.dto.Member;
import cn.yj.simple.dto.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/d")
public class DemoController {

    @RequestMapping("/hola.do")
    @ResponseBody
    public Result hola(){
        Result result = new Result();
        result.setData("hola");
        return result;
    }

    @RequestMapping("/world.do")
    @ResponseBody
    public Result world(){
        Result result = new Result();
        result.setData("world");
        return result;
    }
}
