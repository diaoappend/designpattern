package com.diao.abstractFactory;

import com.diao.abstractFactory.factory.Factory;
import com.diao.abstractFactory.factory.impl.FactoryA;
import com.diao.abstractFactory.factory.impl.FactoryB;

/**
 * @author: Chenzhidiao
 * @date: 2019/12/30 15:58
 * @description:
 * @version: 1.0
 */

/**
 * 1.定义抽象工厂类
 * 2.定义抽象产品族类
 * 3.定义抽象产品类
 * 4.定义具体产品类
 * 5.定义具体工厂类
 * 6.客户端通过具体工厂类，获取具体产品实例对象，然后调用对象的方法
 */
public class Client {
    public static void main(String[] args) {
        Factory a = new FactoryA();
        Factory b = new FactoryB();

        a.phoneProduct().show();
        a.tvProduct().show();
        b.phoneProduct().show();
        b.tvProduct().show();
    }
}
