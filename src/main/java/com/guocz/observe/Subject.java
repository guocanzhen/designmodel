package com.guocz.observe;

/**
 * @author guocz
 * @date 2022/9/1 15:59
 * 抽象被观察者（Subject）
 */
public interface Subject {

    /**
     * 增加订阅者
     * @param observer
     */
    void attach(Observer observer);

    /**
     * 删除订阅者
     * @param observer
     */
    void detach(Observer observer);

    /**
     * 通知订阅者更新消息
     * @param message
     */
    void notify(String message);
}
