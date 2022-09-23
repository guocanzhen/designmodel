package com.guocz.factorymethod;

/**
 * @author guocz
 * @date 2022/9/1 9:59
 */
public class FactoryMethod {
    public static void main(String[] args) {
        AbstractFactory factory = new AppleFactory();
        factory.makePhone();
        factory.makePc();
    }
}
