package cn.wildsky.beandemo.config;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

//@Service
//@Scope("prototype")
public class FunctionService {
    FunctionService() {
        System.out.println("我被调用了！");
    }

    public String sayHello(String word) {
        return "Hello " + word + " !";
    }
}
