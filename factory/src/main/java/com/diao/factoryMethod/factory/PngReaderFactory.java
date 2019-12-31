package com.diao.factoryMethod.factory;

import com.diao.factoryMethod.reader.PngReader;
import com.diao.factoryMethod.reader.Reader;

/**
 * @author: Chenzhidiao
 * @date: 2019/12/30 14:50
 * @description:
 * @version: 1.0
 */
public class PngReaderFactory implements ReaderFactory {
    public Reader getReader() {
        return new PngReader();
    }
}
