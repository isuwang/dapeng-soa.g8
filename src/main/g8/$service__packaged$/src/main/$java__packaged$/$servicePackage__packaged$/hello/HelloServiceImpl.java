package com.isuwang.soa.hello;

import com.isuwang.dapeng.core.SoaException;
import com.isuwang.soa.hello.domain.Hello;
import com.isuwang.soa.hello.service.HelloService;

public class HelloServiceImpl implements HelloService{
    @Override
    public Hello sayHello(String content) throws SoaException {
        return new Hello().content(content);
    }
}
