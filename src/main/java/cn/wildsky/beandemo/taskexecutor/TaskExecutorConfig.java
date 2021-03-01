package cn.wildsky.beandemo.taskexecutor;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
@ComponentScan("cn.wildsky.beandemo.taskexecutor")
@EnableAsync
public class TaskExecutorConfig implements AsyncConfigurer {
    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(10); //设置核心线程池
        taskExecutor.setMaxPoolSize(100); //设置最大线程池
        taskExecutor.setQueueCapacity(25); //设置队列容量
        taskExecutor.initialize(); //初始化线程配置
        return taskExecutor;
    }
}
