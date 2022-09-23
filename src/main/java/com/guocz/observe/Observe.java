package com.guocz.observe;

import com.guocz.observe.*;

/**
 * @author guocz
 * @date 2022/9/1 16:09
 */
public class Observe {

    public static void main(String[] args) {
        Observer observer = new WeixinUser("张三");
        Observer observer1 = new WeixinUser("李四");
        Observer observer2 = new WeixinUser("王五");

        Subject subject = new SubscriptionSubject();
        subject.attach(observer);
        subject.attach(observer1);
        subject.attach(observer2);

        Observer observer3 = new AliUser("小六");
        subject.attach(observer3);

        subject.notify("各环节可代发VB");
    }
}
