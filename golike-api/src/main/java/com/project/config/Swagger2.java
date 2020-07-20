package com.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author nameM
 */
@Configuration
@EnableSwagger2
public class Swagger2 {

    //http://localhost:8088/swagger-ui.html
    //http://localhost:8088/doc.html

    //配置核心配置
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)     //指定api类型为swagger2
                    .apiInfo(apiInfo() )                         //用于定义api文档汇总信息
                    .select().apis(RequestHandlerSelectors
                        .basePackage("com.project.controller"))       //指定Controller
                    .paths(PathSelectors.any())                     //所有Controller
                    .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("golike平台")        //文档页标题
                .contact(new Contact("iii",
                        "",
                        "zhiwei741@icloud.com"))
                .description("api文档")
                .version("1.0.1")
                .termsOfServiceUrl("http:wwww")
                .build();
    }
}
