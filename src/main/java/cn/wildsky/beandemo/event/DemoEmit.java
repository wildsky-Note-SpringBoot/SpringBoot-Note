package cn.wildsky.beandemo.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoEmit {
    @Autowired
    ApplicationContext applicationContext;

    public void emit(String msg) {
        applicationContext.publishEvent(new DemoEvent(this, msg));
    }
}
