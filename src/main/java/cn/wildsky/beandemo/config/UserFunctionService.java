package cn.wildsky.beandemo.config;

public class UserFunctionService {
    FunctionService functionService;
    public void setFunctionService(FunctionService functionService){
        this.functionService = functionService;
    }
    public String SayHello(String word){
        return this.functionService.sayHello(word);
    }
}
