package com.swp;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.swp.dao")//这里和UserDao上二选一就行,使dao下面所有的接口在mapper中找到对应的id,避免了复杂的xml
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}