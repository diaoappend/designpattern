package com.diao.factoryMethod;

import com.diao.factoryMethod.factory.GifReaderFactory;
import com.diao.factoryMethod.factory.ReaderFactory;
import com.diao.factoryMethod.reader.Reader;

/**
 * @author: Chenzhidiao
 * @date: 2019/12/30 14:52
 * @description:
 * @version: 1.0
 */

/**
 * 1.定义抽象产品类
 * 2.定义具体产品类
 * 3.定义公共工厂接口
 * 4.定义具体工厂类，用来获取具体对象
 * 5.客户端通过具体工厂类获取具体对象，调用对象的方法
 */
public class ReaderClient {
    public static void main(String[] args) {
        //这里只需要根据具体需求去创建具体的工厂对象即可，后面的代码都可以复用
        ReaderFactory factory =  new GifReaderFactory();
        Reader reader = factory.getReader();
        reader.read();
    }
}
