package com.diao.simpleFactory.pizzastore;

/**
 * @author: Chenzhidiao
 * @date: 2019/12/30 10:10
 * @description:
 * @version: 1.0
 */
public class GreekPizza extends Pizza {

    public void prepare() {
        System.out.println("制作GreekPizza准备工作");
    }
}

