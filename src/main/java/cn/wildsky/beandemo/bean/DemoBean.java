package cn.wildsky.beandemo.bean;

import org.springframework.context.annotation.Bean;

public class DemoBean {
    public DemoBean(String msg) {
        System.out.println(msg);
    }
}
