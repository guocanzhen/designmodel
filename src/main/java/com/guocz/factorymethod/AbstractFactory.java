package com.guocz.factorymethod;

import com.guocz.factorydomain.PC;
import com.guocz.factorydomain.Phone;

/**
 * @author guocz
 * @date 2022/9/1 9:57
 * AbstractFactory类：生产不同产品的工厂的抽象类
 */
public interface AbstractFactory {

    Phone makePhone();

    PC makePc();
}
