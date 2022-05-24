package com.zf.musicweb;



import com.zf.musicweb.entity.Singer;
import org.junit.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.Resource;
import java.util.List;


@SpringBootApplication
@MapperScan("com.zf.musicweb.dao")//扫描Dao文件
@SpringBootTest
public class MusicwebApplicationTests {

 @Resource
 private RedisTemplate redisTemplate;

    public static void main(String[] args) {
        SpringApplication.run(MusicwebApplication.class, args);
    }

    @Test
    public void tt(){
        List t=redisTemplate.opsForList().range("songList",0,10);
        t.stream().forEach(System.out::println);
    }



}
