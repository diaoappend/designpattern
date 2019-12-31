package com.diao.staticproxy;

import com.diao.bean.ITeacher;
import com.diao.bean.Teacher;

/**
 * @author: Chenzhidiao
 * @date: 2019/12/27 10:11
 * @description:
 * @version: 1.0
 */
public class ProxyTeacher implements ITeacher {
    private Teacher teacher = new Teacher();
    public void teach() {
        System.out.println("上课了");
        teacher.teach();
        System.out.println("同学认真听讲");
    }
}
