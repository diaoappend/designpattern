package com.diao.factoryMethod.reader;

/**
 * @author: Chenzhidiao
 * @date: 2019/12/30 14:45
 * @description:现在需要设计一个这样的图片加载类，它具有多个图片加载器，用来加载jpg，png，gif格式的图片，每个加载器都有一个read（）方法，用于读取图片。
 * @version: 1.0
 */

public interface Reader {
    void read();
}
