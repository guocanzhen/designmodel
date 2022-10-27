package com.guocz.proxy.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guocz
 * @date 2022/9/27 13:44
 */
@RestController
@RequestMapping("aop")
public class AopController {

    @Autowired
    private AopObject aopObject;

    @GetMapping("test")
    public void aopTest() {
        aopObject.aoped();
        aopObject.dfa();
        aopObject.eg();
    }
}
