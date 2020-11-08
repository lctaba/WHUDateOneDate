package com.WHUDateOneDate.Starter.Config;


/**
 * @Author cyh
 * @Date 2010/10/30
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
@ComponentScan("com.WHUDateOneDate.Controller")
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.WHUDateOneDate.Controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("WHUDateOneDate")
                .description("WHUDateOneDate 武大约一约")
                .contact(new Contact("cyh", "https://github.com/lctaba", "1169858807@qq.com"))
                .termsOfServiceUrl("https://github.com/lctaba/WHUDateOneDate")
                .version("1.0.0")
                .build();
    }
}
