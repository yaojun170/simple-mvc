package cn.yj.simple.service;

import cn.yj.simple.dto.Member;

import java.util.List;

/**
 * @Description
 * @Author yaojun
 * @Date 2021-12-10
 */
public interface MemberService {
    List<Member> queryMembers();
}
