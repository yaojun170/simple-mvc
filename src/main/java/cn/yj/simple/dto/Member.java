package cn.yj.simple.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

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
        int[][] points = {};
        Arrays.sort(points,(o1,o2)->{
            return 1;
        });
    }
}
