package cn.yj.simple.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.Test;
import org.springframework.core.SpringVersion;

import java.util.Arrays;
import java.util.Comparator;

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

    public static void main(String[] args) {
        String version = SpringVersion.getVersion();
        System.out.println(version);
    }
}
