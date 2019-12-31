package com.diao.abstractFactory.product;

/**
 * @author: Chenzhidiao
 * @date: 2019/12/30 15:26
 * @description:定义抽象产品类，定义具体产品的公共接口，如手机类
 * @version: 1.0
 */
public abstract class PhoneProduct extends AbstractProduct {
    @Override
    public abstract void show();
}
