package dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import dubbo.provider.service.HelloWorld;


@Service(version = "1.0.0")
public class HelloWorldImpl implements HelloWorld {

    @Override
    public String sayHello(){

        return "hello world!";
    }
}
