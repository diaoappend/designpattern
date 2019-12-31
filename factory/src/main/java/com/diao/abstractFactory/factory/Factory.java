package com.diao.abstractFactory.factory;

import com.diao.abstractFactory.product.AbstractProduct;

/**
 * @author: Chenzhidiao
 * @date: 2019/12/30 15:19
 * @description:抽象工厂类，定义具体工厂的公共接口,方法的返回值为抽象产品族类
 * @version: 1.0
 */
public abstract class Factory {
    public abstract AbstractProduct phoneProduct();
    public abstract AbstractProduct tvProduct();
}
