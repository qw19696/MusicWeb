package com.zf.musicweb.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
    @Bean//此对象为Swagger中的全局配置对象
    public Docket docket(){
        Docket docket=new Docket(DocumentationType.SWAGGER_2);
        //配置描述信息
        ApiInfo apiInfo =new ApiInfoBuilder()
                .contact(new Contact("MusicWeb","临时开发","429558984@qq.com"))
                .title("MusicWeb测试帮助文档")
                .description("接口目录")
                .version("1.0")
                .build();
        docket.apiInfo(apiInfo);
        return docket;
    }
}
