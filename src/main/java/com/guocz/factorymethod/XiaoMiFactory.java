package com.guocz.factorymethod;

import com.guocz.factorydomain.MiPC;
import com.guocz.factorydomain.MiPhone;
import com.guocz.factorydomain.PC;
import com.guocz.factorydomain.Phone;

/**
 * @author guocz
 * @date 2022/9/1 9:58
 * XiaoMiFactory类：生产小米手机的工厂（ConcreteFactory1）
 */
public class XiaoMiFactory implements AbstractFactory{
    @Override
    public Phone makePhone() {
        return new MiPhone();
    }

    @Override
    public PC makePc() {
        return new MiPC();
    }
}