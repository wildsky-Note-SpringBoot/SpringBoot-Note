package cn.wildsky.beandemo.config;

import cn.wildsky.beandemo.bean.DemoBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {
    @Bean
    public DemoBean devBean(){
        return new DemoBean("dev");
    }

    @Bean
    public DemoBean prodBean(){
        return new DemoBean("prod");
    }
}
