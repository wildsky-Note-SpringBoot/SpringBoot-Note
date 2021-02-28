package cn.wildsky.beandemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;


@Configuration
public class JavaConfig {
    /*
     * 若声明 Bean，则会在ioc容器中创建一个对象，并且ioc容器仅会创建一个创建Bean实例
     * 若在类中加入@Service注解，效果与上述相同，均等价于创建Bean实例，但是多了一个功能：声明该类为Service。
     * 因为只有一个Bean实例，所以加入@Service注解的类不能够创建多个实例，整个容器共享这一个实例，而@Bean可以
     *
     * */
    @Bean
    public FunctionService functionService() {
        return new FunctionService();
    }

}
