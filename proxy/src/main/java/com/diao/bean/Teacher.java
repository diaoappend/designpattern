package com.diao.bean;

/**
 * @author: Chenzhidiao
 * @date: 2019/12/27 10:10
 * @description:
 * @version: 1.0
 */
public class Teacher implements ITeacher {
    private String name;

    public Teacher() {
    }

    public Teacher(String name) {
        this.name = name;
    }

    public void teach() {
        System.out.println("老师正在授课");
    }
}
