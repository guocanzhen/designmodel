package com.guocz.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guocz
 * @date 2022/9/1 16:03
 * 具体被观察者（ConcreteSubject）
 */
public class SubscriptionSubject implements Subject{

    //储存订阅公众号的微信用户
    private final List<Observer> weChatUserList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        weChatUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weChatUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer o :
                weChatUserList) {
            o.update(message);
        }
    }
}
