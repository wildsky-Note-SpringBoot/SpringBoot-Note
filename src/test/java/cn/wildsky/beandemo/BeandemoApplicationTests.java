package cn.wildsky.beandemo;

import cn.wildsky.beandemo.bean.DemoBean;
import cn.wildsky.beandemo.config.EventConfig;
import cn.wildsky.beandemo.config.FunctionService;
import cn.wildsky.beandemo.event.DemoEmit;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootTest
class BeandemoApplicationTests {
    @Autowired
    FunctionService functionService;

    @Autowired
    FunctionService functionService1;

    @Autowired
    ApplicationContext ioc;
    @Test
    void contextLoads() {
        System.out.println(ioc.containsBean("functionService"));
        System.out.println(functionService.sayHello("er"));
        System.out.println(functionService1.sayHello("er"));
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoEmit emit = context.getBean(DemoEmit.class);
        emit.emit("你好");
        context.close();
    }

}
