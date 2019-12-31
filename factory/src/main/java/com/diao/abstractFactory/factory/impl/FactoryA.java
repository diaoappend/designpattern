package com.diao.abstractFactory.factory.impl;

import com.diao.abstractFactory.factory.Factory;
import com.diao.abstractFactory.product.AbstractProduct;
import com.diao.abstractFactory.product.impl.HaierTvProduct;
import com.diao.abstractFactory.product.impl.XiaomiPhoneProduct;

/**
 * @author: Chenzhidiao
 * @date: 2019/12/30 15:54
 * @description:具体工厂类（继承抽象工厂类），定义创建对应具体产品实例的方法；
 * @version: 1.0
 */
public class FactoryA extends Factory {
    @Override
    public AbstractProduct phoneProduct() {
        return new XiaomiPhoneProduct();
    }
    @Override
    public AbstractProduct tvProduct() {
        return new HaierTvProduct();
    }
}
