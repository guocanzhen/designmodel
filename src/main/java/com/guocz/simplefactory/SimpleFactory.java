package com.guocz.simplefactory;

import com.guocz.factorydomain.Phone;
import com.guocz.simplefactory.PhoneFactory;

/**
 * @author guocz
 * @date 2022/9/1 9:28
 */
public class SimpleFactory {

    public static void main(String[] args) {
        Phone phone = PhoneFactory.makePhone("MiPhone");
    }
}
