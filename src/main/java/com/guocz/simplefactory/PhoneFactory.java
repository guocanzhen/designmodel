package com.guocz.simplefactory;

import com.guocz.factorydomain.IPhone;
import com.guocz.factorydomain.MiPhone;
import com.guocz.factorydomain.Phone;

/**
 * @author guocz
 * @date 2022/9/1 9:27
 * PhoneFactory类：手机代工厂（Factory）
 */
public class PhoneFactory {
    public static Phone makePhone(String phoneType) {
        if(phoneType.equalsIgnoreCase("MiPhone")){
            return new MiPhone();
        }
        else if(phoneType.equalsIgnoreCase("iPhone")) {
            return new IPhone();
        }
        return null;
    }
}