package com.diao.abstractFactory.product.impl;

import com.diao.abstractFactory.product.PhoneProduct;

/**
 * @author: Chenzhidiao
 * @date: 2019/12/30 15:51
 * @description:具体产品类（继承抽象产品类）， 定义生产的具体产品，如苹果手机
 * @version: 1.0
 */
public class ApplePhoneProduct extends PhoneProduct {
    public void show() {
        System.out.println("生产苹果手机");
    }
}
