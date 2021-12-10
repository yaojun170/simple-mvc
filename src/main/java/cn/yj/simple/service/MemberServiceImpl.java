package cn.yj.simple.service;

import cn.yj.simple.dto.Member;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author yaojun
 * @Date 2021-12-10
 */
@Service
public class MemberServiceImpl implements MemberService{
    @Override
    public List<Member> queryMembers() {
        System.out.println("--queryMembers--start");
        List<Member> list = new ArrayList<>();
        list.add(new Member("zhangsan", "beijing.china", 28));
        list.add(new Member("lisi", "shenzhen.china", 52));
        list.add(new Member("wangwu", "shanghai.china", 35));
        return list;
    }
}
