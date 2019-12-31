package com.diao.cglibproxy;

/**
 * @author: Chenzhidiao
 * @date: 2019/12/27 10:44
 * @description:
 * @version: 1.0
 */
//cglib代理的被代理类不用再实现指定接口
public class TeacherDao {
    public void teach(){
        System.out.println("授课中");
    }
}
