package com.foxwho.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@MapperScan("com.baidu.fsg.uid")
public class ProviderApplication {


    public static void main(String[] args) {
        new SpringApplicationBuilder(ProviderApplication.class).run(args);
    }
}
