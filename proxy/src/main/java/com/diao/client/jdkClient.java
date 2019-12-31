package com.diao.client;

import com.diao.bean.ITeacher;
import com.diao.bean.Teacher;
import com.diao.jdkproxy.ProxyFactory;

/**
 * @author: Chenzhidiao
 * @date: 2019/12/27 10:22
 * @description:
 * @version: 1.0
 */
public class jdkClient {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        ProxyFactory proxyFactory = new ProxyFactory(teacher);
        ITeacher instance = (ITeacher) proxyFactory.getProxyInstance();
        instance.teach();

    }
}
