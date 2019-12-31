package com.diao.client;

import com.diao.staticproxy.ProxyTeacher;

/**
 * @author: Chenzhidiao
 * @date: 2019/12/27 10:13
 * @description:
 * @version: 1.0
 */
public class staticClient {
    static ProxyTeacher proxyTeacher = new ProxyTeacher();
    public static void main(String[] args) {
        proxyTeacher.teach();
    }
}
