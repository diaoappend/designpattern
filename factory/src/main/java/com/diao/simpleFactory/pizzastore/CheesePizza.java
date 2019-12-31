package com.diao.simpleFactory.pizzastore;

/**
 * @author: Chenzhidiao
 * @date: 2019/12/30 10:09
 * @description:
 * @version: 1.0
 */
public class CheesePizza extends Pizza{
    public void prepare() {
        System.out.println("制作CheesePizza准备工作");
    }
}
