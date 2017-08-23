package com.ideabook.util;

import java.io.*;

/**
 * @Author: lzh
 * @Description: jdk1.8测试可用
 * @Date: Created in 2017/8/21 15:23
 */
public class CloneUtil {
    /**
     * 使用该工具类的对象必须要实现Serializable接口，否则是没有办法实现克隆的。
     * @param obj 序列化的对象
     * @param <T> 对象类型
     * @return 复制的新对象
     */
    public static <T extends Serializable> T clone(T obj){
        T cloneObj = null;
        try {
            //写入字节流
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ObjectOutputStream obs = new ObjectOutputStream(out);

            obs.writeObject(obj);
            obs.close();

            //分配内存，写入原始对象，生成新对象
            ByteArrayInputStream ins = new ByteArrayInputStream(out.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(ins);
            //返回生成新对象
            cloneObj = (T) ois.readObject();
            ois.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        return cloneObj;
    }
}
