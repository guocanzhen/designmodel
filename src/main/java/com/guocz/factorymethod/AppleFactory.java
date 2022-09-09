package com.guocz.factorymethod;

import com.guocz.factorydomain.IPhone;
import com.guocz.factorydomain.MAC;
import com.guocz.factorydomain.PC;
import com.guocz.factorydomain.Phone;

/**
 * @author guocz
 * @date 2022/9/1 9:58
 * AppleFactory类：生产苹果手机的工厂（ConcreteFactory2）
 */
public class AppleFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new IPhone();
    }

    @Override
    public PC makePc() {
        return new MAC();
    }


}