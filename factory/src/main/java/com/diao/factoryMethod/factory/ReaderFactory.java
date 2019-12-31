package com.diao.factoryMethod.factory;

import com.diao.factoryMethod.reader.Reader;

/**
 * @author: Chenzhidiao
 * @date: 2019/12/30 14:49
 * @description:定义一个工厂接口，用来获取Reader实例对象
 * @version: 1.0
 */
public interface ReaderFactory {
    Reader getReader();
}
