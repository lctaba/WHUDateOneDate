package com.WHUDateOneDate.Starter;
/**
 * @Author cyh
 * @Date 2010/10/30
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@ServletComponentScan("com.WHUDateOneDate")
@ComponentScan("com.WHUDateOneDate")
@EnableSwagger2
@SpringBootApplication
public class AppStarter {
    public static void main(String[] args){
        SpringApplication.run(AppStarter.class, args);
    }
}
