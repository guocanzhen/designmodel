package com.guocz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author guocz
 * @date 2022/8/31 16:17
 */
@SpringBootApplication
// 加入切面自动代理，使切面注解生效
@EnableAspectJAutoProxy
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
