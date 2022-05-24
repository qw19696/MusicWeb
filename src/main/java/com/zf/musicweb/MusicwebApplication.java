package com.zf.musicweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.zf.musicweb.dao")//扫描Dao文件
@EnableSwagger2//开启Swagger2服务
public class MusicwebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MusicwebApplication.class, args);
    }

}
