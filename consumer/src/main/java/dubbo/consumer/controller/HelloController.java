package dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import dubbo.provider.service.HelloWorld;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {

    @Reference(version = "1.0.0")
    private HelloWorld helloWorld;

    @RequestMapping("/say")
    public String sayHello(){
        return helloWorld.sayHello();
    }
}
