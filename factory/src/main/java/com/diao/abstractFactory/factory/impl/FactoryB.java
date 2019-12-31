package com.diao.abstractFactory.factory.impl;

import com.diao.abstractFactory.factory.Factory;
import com.diao.abstractFactory.product.AbstractProduct;
import com.diao.abstractFactory.product.impl.ApplePhoneProduct;
import com.diao.abstractFactory.product.impl.HaixinTvProduct;

/**
 * @author: Chenzhidiao
 * @date: 2019/12/30 15:57
 * @description:具体工厂类（继承抽象工厂类），定义创建对应具体产品实例的方法；
 * @version: 1.0
 */
public class FactoryB extends Factory {
    @Override
    public AbstractProduct phoneProduct() {
        return new ApplePhoneProduct();
    }
    @Override
    public AbstractProduct tvProduct() {
        return new HaixinTvProduct();
    }
}
