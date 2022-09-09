package com.guocz.proxy;

/**
 * @author guocz
 * @date 2022/9/1 15:01
 * 静态代理
 * 代理类实现接口，完成委托类预处理消息、过滤消息、把消息转发给委托类，以及事后处理消息等。
 */
public class StudentProxy implements Person{

    Student student;

    public StudentProxy(Person person) {
        // 只代理学生对象
        if (person.getClass() == Student.class) {
            this.student = (Student) person;
        }
    }

    @Override
    public void giveMoney() {

        // 静态代理
        System.out.println("代理说：张三最近学习有进步！");
        student.giveMoney();
        System.out.println("代理结束");
    }
}
