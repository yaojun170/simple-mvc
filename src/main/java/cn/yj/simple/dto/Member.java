package cn.yj.simple.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Description
 * @Author yaojun
 * @Date 2021-12-10
 */
@Data
@AllArgsConstructor
public class Member {
    private String name;
    private String address;
    private int age;
}
