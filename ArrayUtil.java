package com.ideabook.util;

import java.util.Arrays;

/**
 * @Author: lzh
 * @Description:jdk1.8测试可用
 * @Date: Created in 2017/8/22 16:13
 */
public class ArrayUtil {

    /**
     * 对一维数组进行扩容
     * @param datas 原始数组
     * @param newLen 扩容大小(增加多少容量)
     * @param <T>
     * @return
     */
    public static <T> T[] expandCapacity(T[] datas,int newLen){
        int oldLen = datas.length;
        newLen = newLen < 0 ? oldLen : oldLen + newLen;
        return Arrays.copyOf(datas,newLen);
    }

    /**
     * 对数组进行扩容处理，变为1.5倍。
     * @param datas 原数组
     * @param <T> 数组的类型
     * @return T[] 返回数组
     */
    public static <T> T[] expandCapacity(T[] datas){
        int newLen = (datas.length * 3) /2 ;
        //生成一个新的数组
        return Arrays.copyOf(datas,newLen);
    }

    /**
     * 对数组进行成倍的扩容处理,
     * @param datas 原数组
     * @param mulitiple 扩容倍数
     * @param <T>
     * @return
     */
    public static <T> T[] expandCapacityMlu(T[] datas,int mulitiple){
        mulitiple = mulitiple < 0 ? 1 : mulitiple;
        int newLen = datas.length * mulitiple;
        return Arrays.copyOf(datas,newLen);
    }

}
