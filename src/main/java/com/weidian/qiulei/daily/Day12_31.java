package com.weidian.qiulei.daily;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Created by qiulei on 16/12/30.
 */
public class Day12_31 {
    public static void main(String[] args) {
        Character.isWhitespace('\t');               //判断字符是否为空格
        ArrayUtils.isEmpty(args);                   //判断数组为null或长度为0

        Integer[] is = new Integer[]{1, 2, 3};
        for (Integer i : is) {
            i = 1;                                  //不会改变is,只是定义了另一个引用i,并改变它
        }
        int l;
        if ((l = is.length) == 0);                  //一种写法
    }
}
