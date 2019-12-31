package com.diao.factoryMethod.factory;

import com.diao.factoryMethod.reader.JpgReader;
import com.diao.factoryMethod.reader.Reader;

/**
 * @author: Chenzhidiao
 * @date: 2019/12/30 14:50
 * @description:
 * @version: 1.0
 */
public class JpgReaderFactory implements ReaderFactory {
    public Reader getReader() {
        return new JpgReader();
    }
}
