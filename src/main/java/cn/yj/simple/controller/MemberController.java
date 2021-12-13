package cn.yj.simple.controller;

import cn.yj.simple.dto.Member;
import cn.yj.simple.dto.Result;
import cn.yj.simple.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/m")
public class MemberController{

	@Autowired
	private MemberService memberService;
	
	/**
	 * 批量创建成员
	 * @return
	 */
	@RequestMapping("/add.do")
	@ResponseBody
	public Result create() {
		Result result = new Result();
		return result;
	}

	/**
	 * 查询初始化密码,密码未修改之前.
	 * @return
	 */
	@RequestMapping("/list.do")
	@ResponseBody
	public Result list(HttpServletRequest request){
		Result result = new Result();
		List<Member> members = memberService.queryMembers();
		result.setData(members);
		return result;
	}

}
