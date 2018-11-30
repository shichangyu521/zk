package com.ziigeer.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by Shicy on 2017/09/19.
 */
@Configuration
@EnableSwagger2
@EnableWebMvc
public class MySwaggerConfig {

    @Bean
    public Docket customDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
            .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("毛毛", "", "455514253@qq.com");
        return new ApiInfoBuilder()
            .title("自个API接口")
            .description("自个前台API接口")
            .contact(contact)
            .version("1.1.0")
            .build();
    }


//    @Bean
//    public Docket createRestApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//            .apiInfo(apiInfo())
//            .select()
//            .apis(RequestHandlerSelectors.basePackage("com.ziigeet.projects.controller"))
//            .paths(PathSelectors.any())
//            .build();
//    }
}
