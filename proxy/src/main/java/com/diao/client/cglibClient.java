package com.diao.client;

import com.diao.cglibproxy.CglibProxyFactory;
import com.diao.cglibproxy.TeacherDao;

/**
 * @author: Chenzhidiao
 * @date: 2019/12/27 11:04
 * @description:
 * @version: 1.0
 */
public class cglibClient {
    public static void main(String[] args) {
        //创建目标对象
        TeacherDao teacherDao = new TeacherDao();
        //获取代理对象
        TeacherDao proxyInstance = (TeacherDao)new CglibProxyFactory(teacherDao).getProxyInstance();
        //执行代理对象的方法，触发intercepter方法，从而实现对目标对象的代理
        proxyInstance.teach();

    }
}
